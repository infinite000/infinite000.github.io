package com.soft.mapper;

import com.soft.bean.TbDiet;
import com.soft.bean.TbFinance;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
public interface TbFinanceMapper extends BaseMapper<TbFinance> {
    public List<TbDiet> selectmonth(Integer id);
}
