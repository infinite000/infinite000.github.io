package com.soft.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.bean.TbDiet;
import com.soft.bean.TbFinance;
import com.soft.mapper.TbDietMapper;
import com.soft.mapper.TbEntertainmentMapper;
import com.soft.mapper.TbFinanceMapper;
import com.soft.service.TbFinanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
@Service
public class TbFinanceServiceImpl extends ServiceImpl<TbFinanceMapper, TbFinance> implements TbFinanceService {
    /**
     * 餐饮模块
     */
    @Autowired
    TbDietMapper tbDietMapper;

    /**
     * 娱乐模块
     */
    @Autowired
    TbEntertainmentMapper tbEntertainmentMapper;

    /**
     * 金融模块
     */
    @Autowired
    TbFinanceMapper tbFinanceMapper;


    Calendar calendar = Calendar.getInstance();
    int i = calendar.get(Calendar.YEAR); //获取最新一年的年份
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");


    @Override
    public Map<String, List> getMonth(Integer id) {
        //定义一个arraylist集合，用来存放每个月份消费情况
        List<BigDecimal> arraylist1 = new ArrayList<>();
        for (int j = 0; j <12 ; j++) {
            arraylist1.add(new BigDecimal(0));
        }

        //先搞月份
        int m = calendar.get(Calendar.MONTH)+1;
        // System.out.println(m);  获取当前月份，需要+1
        //定义一个数组，用来存放月份
        Integer [] month = new Integer[12];

        //开始往数组放月份
        for (int j = 0; j <month.length ; j++) {
            if(m!=0){
                month[j] = m;
            }else {
                m=12;
                month[j]=m;
            }
            m--;
        }
        ArrayUtils.reverse(month);  //翻转
        //[9,10,11,12,1,2,3,4,5,6,7,8]
        List<Integer> arrayList2 = new ArrayList<>();

        //将月份按顺序放入到list集合内
        arrayList2= Arrays.asList(month);
//        for (Integer i: month) {
//            System.out.println(i);
//        }  //测试获取到的月份数据，测试无误
        //[8,7,6,5,4,3,2,1,12,11,10,9]
        List<TbDiet> selectmonth = tbFinanceMapper.selectmonth(id);
        //获取当前用户近12个月的全部消费情况


        //然后获取从数据库内取出的时间数据，并获取其月份
        for (TbDiet t: selectmonth) {
            int month1 = Integer.parseInt(String.format("%tm",t.getFTime()));
            //获取指定日期的月份
            //System.out.println(month1);
            //测试成功
            //用从数据库内获取到的月份与java端获取到的月份进行比对
            for (int j = 0; j <month.length ; j++) {
                if(month[j].equals(month1)){
                    arraylist1.set(j,arraylist1.get(j).add(t.getFMoney()));
                }
            }
        }
        //检测是否放入成功
        //System.out.println(arraylist1.toString());
        //检测完成，数据放入成功
        Map<String,List> map1 =new HashMap<>();
        map1.put("月份",arrayList2);
        map1.put("消费",arraylist1);
        return map1;
    }

    @Override
    public Map<String, List> getgetmoney(Integer id) {
        //准备工作开始
        //获取近8年的年份，然后将他们放到一个数组里，做前端界面的x轴
        Integer[] year = new Integer[8];
        for (int j = 7; j >= 0; j--) {
            year[j] = i - j;
        }
        //得出来的数据是倒着排的，需要翻一下
        ArrayUtils.reverse(year);
        //得到的结果为：
        //[2014,2015,2016,2017,2018,2019,2020,2021]

        //声明一个list1集合，按顺序存放饮食消费,顺序与年份顺序对应且数据对应
        List<BigDecimal>list1 =new ArrayList<>();
        //声明一个list2集合，按顺序存放娱乐消费,顺序与年份顺序对应且数据对应
        List<BigDecimal>list2 =new ArrayList<>();
        //声明一个list3集合，按顺序存放房贷支出,顺序与年份顺序对应且数据对应
        List<BigDecimal>list3 =new ArrayList<>();
        //声明一个list4集合，按顺序存放车贷支出,顺序与年份顺序对应且数据对应
        List<BigDecimal>list4=new ArrayList<>();
        //声明一个list4集合，按顺序存放车贷支出,顺序与年份顺序对应且数据对应
        List<BigDecimal>list5=new ArrayList<>();
        //声明一个list6集合，用来存放年份数据，作为折线图的x轴数据源
        List<Integer> list6 = new ArrayList<>();

        //将年份按顺序放入到list集合内
        list6= Arrays.asList(year);

        System.out.println(list6.toString());


        for (int j = 0; j < 8; j++) {
            list1.add(new BigDecimal(0));
            list2.add(new BigDecimal(0));
            list3.add(new BigDecimal(0));
            list4.add(new BigDecimal(0));
            list5.add(new BigDecimal(0));
        }
        //准备工作结束

        //饮食支出金额数据处理开始
        //按照year数组的顺序来获取对应的每年的饮食消费，并将其放到准备好的list集合内
        for (int j = 0; j <year.length ; j++) {
            QueryWrapper<TbFinance> queryWrapper =new QueryWrapper<TbFinance>();
            queryWrapper.eq("f_userid",id) //筛选id
                    .likeRight("f_time",String.valueOf(year[j])) //筛选年份
                    .eq("f_reason","饮食"); //筛选类型
            List<TbFinance> tbDiets= tbFinanceMapper.selectList(queryWrapper);
            for (TbFinance t: tbDiets) {
                list1.set(j,list1.get(j).add(t.getFMoney())) ;
                //将获取到的数据加到list1集合的对应位置
            }
        }

        //  System.out.println(list1.toString());
        //检测，获取成功，数据无误
        //饮食支出数据处理结束


        //娱乐消费支出金额数据处理开始
        for (int j = 0; j <year.length ; j++) {
            QueryWrapper<TbFinance> queryWrapper =new QueryWrapper<TbFinance>();
            queryWrapper.eq("f_userid",id) //筛选id
                    .likeRight("f_time",String.valueOf(year[j]))
                    .eq("f_reason","娱乐"); //循环筛选
            List<TbFinance> tbDiets= tbFinanceMapper.selectList(queryWrapper);
            for (TbFinance t: tbDiets) {
                list2.set(j,list2.get(j).add(t.getFMoney())) ;
                //将获取到的数据加到list2集合的对应位置
            }
        }
        // System.out.println(list2.toString());
        //检测，获取成功，数据无误
        //娱乐支出数据处理结束


        //房贷支出金额数据处理开始
        //按照year数组的顺序来获取对应的每年的房贷支出，并将其放到准备好的list集合内
        for (int j = 0; j <year.length ; j++) {
            QueryWrapper<TbFinance> queryWrapper =new QueryWrapper<TbFinance>();
            queryWrapper.eq("f_userid",id) //筛选id
                    .likeRight("f_time",String.valueOf(year[j]))
                    .eq("f_reason","房贷"); //循环筛选
            List<TbFinance> tbDiets= tbFinanceMapper.selectList(queryWrapper);
            for (TbFinance t: tbDiets) {
                list3.set(j,list3.get(j).add(t.getFMoney())) ;
                //将获取到的数据加到list1集合的对应位置
            }
        }
        //System.out.println(list3.toString());
        //检测，获取成功，数据无误
        //房贷支出数据处理结束

        //车贷支出金额数据处理开始
        //按照year数组的顺序来获取对应的每年的房贷支出，并将其放到准备好的list集合内
        for (int j = 0; j <year.length ; j++) {
            QueryWrapper<TbFinance> queryWrapper =new QueryWrapper<TbFinance>();
            queryWrapper.eq("f_userid",id) //筛选id
                    .likeRight("f_time",String.valueOf(year[j]))
                    .eq("f_reason","车贷"); //循环筛选
            List<TbFinance> tbDiets= tbFinanceMapper.selectList(queryWrapper);
            for (TbFinance t: tbDiets) {
                list4.set(j,list4.get(j).add(t.getFMoney())) ;
                //将获取到的数据加到list1集合的对应位置
            }
        }
        //System.out.println(list4.toString());
        //检测，获取成功，数据无误
        //车贷支出数据处理结束

        //工资金额数据处理开始
        //按照year数组的顺序来获取对应的每年的工资收入，并将其放到准备好的list集合内
        for (int j = 0; j <year.length ; j++) {
            QueryWrapper<TbFinance> queryWrapper =new QueryWrapper<TbFinance>();
            queryWrapper.eq("f_userid",id) //筛选id
                    .likeRight("f_time",String.valueOf(year[j]))
                    .eq("f_reason","工资"); //循环筛选
            List<TbFinance> tbDiets= tbFinanceMapper.selectList(queryWrapper);
            for (TbFinance t: tbDiets) {
                list5.set(j,list5.get(j).add(t.getFMoney())) ;
                //将获取到的数据加到list5集合的对应位置
            }
        }
        //System.out.println(list5.toString());
        //检测，获取成功，数据无误
        //工资数据处理结束

        //五条折线数据都已经处理完毕，确认无误，建立一个map集合
        Map<String,List> map =new HashMap<>();
        map.put("饮食",list1);
        map.put("娱乐",list2);
        map.put("房贷",list3);
        map.put("车贷",list4);
        map.put("工资",list5);
        map.put("年份",list6);
        //集合排列错误，重新组合

        return map;
    }
}
