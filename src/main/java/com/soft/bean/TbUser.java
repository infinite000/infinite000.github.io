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
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识
     */
    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    /**
     * 人脸id
     */
    private String faceid;
    /**
     * 姓名
     */
    private String fName;

    /**
     * 性别 0男 1女
     */
    private Integer fSex;

    /**
     * 电话号
     */
    private Long fTel;

    /**
     * 身份证号码
     */
    private String fCard;

    /**
     * 年龄
     */
    private String fAge;

    /**
     * 身高(cm)
     */
    private Double fHeight;

    /**
     * 体重(kg)
     */
    private Double fWeight;

    /**
     * 血型
     */
    private String fBloodtype;

    /**
     * 职业
     */
    private String fOccupation;

    /**
     * 学历
     */
    private String fEducation;

    /**
     * 住址
     */
    private String fAddress;

    /**
     * 是否结婚 0未婚 1已婚 2未知
     */
    private Integer fIsmarry;

    /**
     * 生日
     */
    private Date fBirthday;

    /**
     * 更新时间
     */
    private Date fUpdatetime;


}
