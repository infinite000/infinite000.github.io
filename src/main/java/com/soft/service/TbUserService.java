package com.soft.service;

import com.soft.bean.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
public interface TbUserService extends IService<TbUser> {

    TbUser compareFace(String imgUrl) throws Exception;

    TbUser findById(Integer id);

}
