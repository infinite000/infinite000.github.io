package com.soft.service.impl;

import com.soft.bean.TbTrajectory;
import com.soft.mapper.TbTrajectoryMapper;
import com.soft.service.TbTrajectoryService;
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
public class TbTrajectoryServiceImpl extends ServiceImpl<TbTrajectoryMapper, TbTrajectory> implements TbTrajectoryService {

    @Autowired
    TbTrajectoryMapper tbTrajectoryMapper;

    /**
     * 调用mapper获取某个用户的近三个月的行动轨迹
     * @param userid 获取传递的用户id
     * @return
     */
    @Override
    public List<TbTrajectory> getEarehData(Integer userid) {
        return tbTrajectoryMapper.getEarthData(userid);
    }
}
