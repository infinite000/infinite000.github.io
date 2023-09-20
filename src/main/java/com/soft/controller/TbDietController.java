package com.soft.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.bean.*;
import com.soft.mapper.TbDietMapper;
import com.soft.mapper.TbEntertainmentMapper;
import com.soft.mapper.TbFinanceMapper;
import com.soft.service.*;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;



import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
@Api(tags = "大屏第二页信息采集")
@CrossOrigin//跨域访问
@RestController
public class TbDietController {


    /**
     * 用户信息 人脸识别
     * @author chenqian
     * @return
     */
    @Autowired
    TbUserService tbUserService;

    /**
     * 个人履历
     * @author chenqian
     * @return
     */
    @Autowired
    TbResumeService tbResumeService;

    /**
     * 金融
     */
    @Autowired
    TbFinanceService tbFinanceService;


    /**
     * 行动轨迹service层
     */
    @Autowired
    TbTrajectoryService tbTrajectoryService;

    /**
     * 医疗信息service层
     */
    @Autowired
    TbMedicalService tbMedicalService;

    /**
     * 出行记录service层
     */
    @Autowired
    TbTravelService tbTravelService;

    /**
     * 餐饮信息service层
     */
    @Autowired
    private TbDietService tbDietService;

    /**
     * 获取某个用户的近3个月的行动轨迹
     * @param userid 接受前端传递的用户id
     * @return
     */
    @ApiOperation(value="获取某个用户的近3个月的行动轨迹",notes = "根据用户id获取某个用户的近3个月的行动轨迹")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="userid",value="用户id",dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = List.class),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持")
    })
    @PostMapping("/user/earthdata")
    public Object getEarehData(String userid){
        System.out.println(userid);
        if (userid==null){
            return "数据错误";
        }else {
            Integer uid=Integer.parseInt(userid);
            List<TbTrajectory> earehData = tbTrajectoryService.getEarehData(uid);
            return earehData;
        }
    }

    /**
     * 人脸搜索
     * @param imgUrl 接受传递的前端的base64
     * @return
     * @throws Exception
     */
    @ApiOperation(value="人脸搜索",notes = "接受传递的前端的base64尽心那个人脸搜索")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="imgUrl",value="图片资源",dataType = "String",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = TbUser.class, reference = ""),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持"),
    })
    @PostMapping("/user/facerecognition")
    public TbUser faceserach(@RequestParam String imgUrl) throws Exception {
        TbUser tbUser = tbUserService.compareFace(imgUrl);
        return tbUser;
    }

    /**
     * 用户信息
     * @author chenqian
     */
    @ApiOperation(value="用户信息获取",notes = "根据用户id获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name="id",value="用户id",dataType = "Integer",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = TbUser.class, reference = ""),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持"),
    })
    @RequestMapping("/getUser/{id}")
    public TbUser getUser(@PathVariable Integer id ){
        return tbUserService.findById(id);
    }

    /**
     * 个人履历
     * @param id
     * @author chenqian
     * @return
     */
    @ApiOperation(value="个人履历获取",notes = "根据用户id获取个人履历")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name="id",value="用户id",dataType = "Integer",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = List.class, reference = ""),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持"),
    })
    @RequestMapping("/getResume/{id}")
    public List<TbResume> getResume(@PathVariable Integer id){
        return tbResumeService.findByUserId(id);
    }


    /**
     * 先根据f_userid去数据库里边查出该用户最新一年的全部消费情况
     * 然后再对获取到的数据按月份进行分类计算
     *
     * @param id
     */
    @ApiOperation(value="消费情况",notes = "根据f_userid去数据库里边查出该用户最新一年的全部消费情况,按月份进行分类计算")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="id",value="用户id",dataType = "String",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = Map.class, reference = ""),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持"),
    })
    @GetMapping("/getbyid")
    public Map<String, List> get(@RequestParam Integer id) {
        Map<String, List> map1=tbFinanceService.getMonth(id);
        System.out.println(map1.get("月份"));
        return map1;
    }

    /**
     * 先根据f_userid去数据库里边查出该用户最新8年的全部收入与支出情况
     * 然后按年份、按类型分别
     *
     * @param id
     */
    @ApiOperation(value="全部收入与支出情况",notes = "根据f_userid去数据库里边查出该用户最新8年的全部收入与支出情况,按月份进行分类计算")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="id",value="用户id",dataType = "String",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = Map.class, reference = ""),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持"),
    })
    @GetMapping("/getmoneybyid")
    public Map<String, List> getmoney(@RequestParam Integer id) {
        Map<String, List> map=tbFinanceService.getgetmoney(id);
        System.out.println(map);
        return map;
    }

    /**
     * 医疗信息
     * @param userId
     * @return
     */
    @ApiOperation(value="医疗信息查询",notes = "根据用户id查询医疗信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="id",value="用户id",dataType = "String",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = List.class, reference = ""),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持"),
    })
    @RequestMapping("/selectMedical")
    public List<String> selectMedical(Integer userId){
        return tbMedicalService.selectTbMedical(userId);
    }

    /**
     * 出行记录
     * @param userid
     * @return
     */
    @ApiOperation(value="出行记录查询",notes = "根据用户id查询出行记录")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="id",value="用户id",dataType = "String",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = List.class, reference = ""),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持"),
    })
    @GetMapping("/use/gettravel")
    public List<TbTravel> getTravelByUserid(@RequestParam Integer userid){
        List<TbTravel> select = tbTravelService.selectByUserid(userid);
        return select;
    }

    /**
     * 餐饮信息雷达图
     * @param userId
     * @return
     */
    @ApiOperation(value="餐饮信息雷达图查询",notes = "根据用户id查询餐饮信息雷达图")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="id",value="用户id",dataType = "String",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = List.class, reference = ""),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持"),
    })
    @GetMapping("/selectDiet")
    public List<TbDiet> selectDiet(Integer userId) {
        List<TbDiet> tbDiets = tbDietService.selectDiet(userId);
        for (TbDiet tbDiet : tbDiets) {
            System.out.println(tbDiet);
        }
        return tbDiets;
    }

    /**
     * 餐饮信息 词云图
     * @param userid
     * @return
     */
    @ApiOperation(value="餐饮信息 词云图查询",notes = "根据用户id查询餐饮信息 词云图")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="id",value="用户id",dataType = "String",required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功",response = List.class, reference = ""),
            @ApiResponse(code = 400,message = "缺少必要的请求参数"),
            @ApiResponse(code = 401,message = "请求路径没有响应的权限"),
            @ApiResponse(code = 403,message = "请求路径被隐藏不能访问"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径错误"),
            @ApiResponse(code = 405,message = "请求方法不支持"),
    })
    @GetMapping("/user/diet/{userid}")
    public List<TbDiet> getDiet(@PathVariable Integer userid){
        List<TbDiet> tbDiets = tbDietService.selectDietByUserid(userid);
        for (TbDiet tbDiet : tbDiets) {
            System.out.println(tbDiet);
        }
        return tbDiets;
    }


}

