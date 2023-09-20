package com.soft.service;

import com.soft.bean.TbMedical;
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
public interface TbMedicalService extends IService<TbMedical> {

    List<String> selectTbMedical(Integer userId);
}
