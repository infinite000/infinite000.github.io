package com.soft.service;

import com.soft.bean.TbFinance;
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
public interface TbFinanceService extends IService<TbFinance> {

    Map<String,List> getMonth(Integer id);

    Map<String,List> getgetmoney(Integer id);
}
