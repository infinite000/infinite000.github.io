package com.soft.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.bean.TbDiet;
import com.soft.mapper.TbDietMapper;
import com.soft.service.TbDietService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
@Service
public class TbDietServiceImpl extends ServiceImpl<TbDietMapper, TbDiet> implements TbDietService {
    @Autowired
    private TbDietMapper tbDietMapper;

    @Override
    public List<TbDiet> selectDiet(Integer userId) {
        return tbDietMapper.selectDiet(userId);
    }

    public List<TbDiet> selectDietByUserid(Integer userid ) {
        QueryWrapper<TbDiet> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("f_userid",userid).groupBy("f_meal")
                .select("f_meal,sum(f_money) as f_money");
        List<TbDiet> tbDiets = tbDietMapper.selectList(objectQueryWrapper);
        return tbDiets;
    }
}
