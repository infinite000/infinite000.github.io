package com.soft.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.bean.TbTravel;
import com.soft.mapper.TbTravelMapper;
import com.soft.service.TbTravelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
@Service
public class TbTravelServiceImpl extends ServiceImpl<TbTravelMapper, TbTravel> implements TbTravelService {
    @Autowired
    TbTravelMapper tbTravelMapper;

    @Override
    public List<TbTravel> selectByUserid(Integer id) {
        //声明一个实体集合来存放处理后的数据
        QueryWrapper<TbTravel> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("f_userid", id)
                .orderByDesc("f_time");
        //规定条件并按倒序顺序排序
        List<TbTravel> tbTravels = tbTravelMapper.selectList(queryWrapper);
        //调用mybatis-plus提供的方法来获取数据
        return tbTravels;
    }
}
