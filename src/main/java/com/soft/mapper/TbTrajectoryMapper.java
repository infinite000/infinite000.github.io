package com.soft.mapper;

import com.soft.bean.TbTrajectory;
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
public interface TbTrajectoryMapper extends BaseMapper<TbTrajectory> {

    /**
     * 获取某个人的近3个月的行动轨迹的信息
     * @param userid
     * @return
     */
    List<TbTrajectory> getEarthData(Integer userid);

}
