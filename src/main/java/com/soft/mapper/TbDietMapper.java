package com.soft.mapper;

import com.soft.bean.TbDiet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
public interface TbDietMapper extends BaseMapper<TbDiet> {

    List<TbDiet> selectDiet(Integer userId);
}
