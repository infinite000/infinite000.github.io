package com.soft.service;

import com.soft.bean.TbResume;
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
public interface TbResumeService extends IService<TbResume> {

    List<TbResume> findByUserId(Integer id);

}
