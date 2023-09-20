package com.soft.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.bean.TbResume;
import com.soft.mapper.TbResumeMapper;
import com.soft.service.TbResumeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
@Service
public class TbResumeServiceImpl extends ServiceImpl<TbResumeMapper, TbResume> implements TbResumeService {

    @Autowired
    TbResumeMapper tbResumeMapper;

    @Override
    public List<TbResume> findByUserId(Integer id) {
        QueryWrapper<TbResume> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("f_userid",id);
        queryWrapper.orderByDesc("f_time");
        List<TbResume> tbResumes = tbResumeMapper.selectList(queryWrapper);
        return tbResumes;
    }
}
