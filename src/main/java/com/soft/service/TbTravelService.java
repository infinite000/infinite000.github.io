package com.soft.service;

import com.soft.bean.TbTravel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
public interface TbTravelService extends IService<TbTravel> {

    public List<TbTravel> selectByUserid(Integer id);
}
