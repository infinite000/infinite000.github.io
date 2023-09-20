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
public class TbFinance implements Serializable {

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
     * 类型：支出、收入
     */
    private String fType;

    /**
     * 标识(工资、房贷、车贷、买房)
     */
    private String fFlag;

    /**
     * 金额
     */
    private BigDecimal fMoney;

    /**
     * 交易原因
     */
    private String fReason;

    /**
     * 交易时间
     */
    private Date fTime;

    /**
     * 交易对象
     */
    private String fObject;


}
