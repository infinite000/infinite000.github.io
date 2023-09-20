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
public class TbMedical implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    /**
     * 用户标识
     */
    private Integer fUserid;

    /**
     * 医院
     */
    private String fHospital;

    /**
     * 科室
     */
    private String fDepartment;

    /**
     * 患者描述
     */
    private String fDescribe;

    /**
     * 诊断结果
     */
    private String fDiagnosis;

    /**
     * 就诊时间
     */
    private Date fTime;

    /**
     * 医学分类
     */
    private String fType;

    /**
     * 主治医师
     */
    private String fDoctor;


}
