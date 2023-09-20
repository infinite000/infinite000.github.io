package com.soft.service;

import com.soft.bean.TbDiet;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
public interface TbDietService extends IService<TbDiet> {
    List<TbDiet> selectDiet(Integer userId);

    List<TbDiet> selectDietByUserid(Integer userid);
}
