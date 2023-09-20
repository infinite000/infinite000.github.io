package com.soft.bean;

import java.math.BigDecimal;
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
public class TbDiet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    /**
     * 用户id
     */
    private Integer fUserid;

    /**
     * 平台
     */
    private String fPlatform;

    /**
     * 类别(中餐，西餐)
     */
    private String fCategory;

    /**
     * 菜品
     */
    private String fMeal;

    /**
     * 时间
     */
    private Date fTime;

    /**
     * 金额
     */
    private BigDecimal fMoney;


}
