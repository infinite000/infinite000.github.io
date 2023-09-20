package com.soft.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.bean.TbUser;
import com.soft.apl.FaceSerach;
import com.soft.mapper.TbUserMapper;
import com.soft.service.TbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.json.JSONObject;
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
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

    @Autowired
    TbUserMapper tbUserMapper;

    @Autowired
    FaceSerach faceSerach;

    /**
     * 人脸搜索
     *
     * @param imgUrl
     * @return
     * @throws Exception
     */
    @Override
    public TbUser compareFace(String imgUrl) throws Exception {
        TbUser tbUser = null;
        //调用方法查看人脸搜索结果
        JSONObject res = faceSerach.searchbase64(imgUrl, "index1");
        //获取分数/人脸相似度，可以通过查看返回结果看如何获取
        Object  score = res.getJSONObject("result")
                .getJSONArray("user_list")
                .getJSONObject(0).get("score");
        //获取user_id
        Object  faceid = res.getJSONObject("result")
                .getJSONArray("user_list")
                .getJSONObject(0).get("user_id");
        double sc = Double.parseDouble(score.toString());
        //人脸相似度大于80才过
        System.out.println("人脸分数:"+score);
        System.out.println("用户id"+faceid);
        if (sc > 80) {
            //查询数据库是否有一样的userid,数据库字段是faceid
            QueryWrapper<TbUser> qw = new QueryWrapper<TbUser>();
            qw.eq("faceid", faceid);
            List<TbUser> tbUsers = tbUserMapper.selectList(qw);
            if (tbUsers == null || tbUsers.size() == 0) {
                return null;
            } else {
                return tbUsers.get(0);
            }
        }
        return null;
    }

    @Override
    public TbUser findById(Integer id) {
        return tbUserMapper.selectById(id);
    }
}
