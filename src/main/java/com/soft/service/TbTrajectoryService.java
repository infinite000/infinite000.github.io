package com.soft.service;

import com.soft.bean.TbTrajectory;
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
public interface TbTrajectoryService extends IService<TbTrajectory> {

    List<TbTrajectory> getEarehData(Integer userid);
}
