package com.soft.service.impl;

import com.soft.bean.TbMedical;
import com.soft.bean.TbUser;
import com.soft.mapper.TbMedicalMapper;
import com.soft.mapper.TbUserMapper;
import com.soft.service.TbMedicalService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class TbMedicalServiceImpl extends ServiceImpl<TbMedicalMapper, TbMedical> implements TbMedicalService {

    @Autowired
    private TbMedicalMapper tbMedicalMapper;

    @Autowired
    private TbUserMapper tbUserMapper;


    @Override
    public List<String> selectTbMedical(Integer userId) {
        TbMedical tbMedical = tbMedicalMapper.selectById(userId);
        TbUser tbUser = tbUserMapper.selectById(userId);
        List<String> s = new ArrayList<>();
        s.add(tbMedical.getFDiagnosis());
        s.add(tbUser.getFBloodtype());
        return s;
    }
}
