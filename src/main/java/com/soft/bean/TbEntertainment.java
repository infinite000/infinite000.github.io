package com.soft.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbEntertainment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 娱乐标识
     */
    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    /**
     * 用户id
     */
    private Integer fUserid;

    /**
     * 类型
     */
    private String fType;

    /**
     * 内容
     */
    private String fContemd;

    /**
     * 时间
     */
    private Date fTime;

    /**
     * 金额
     */
    private String fMoney;

    /**
     * 地点
     */
    private String fLocation;


}
