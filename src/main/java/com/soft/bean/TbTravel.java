package com.soft.bean;

import java.util.Date;
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
public class TbTravel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id号
     */
    private Integer fId;

    /**
     * 用户id
     */
    private Integer fUserid;

    /**
     * 出行方式
     */
    private String fTraveltype;

    /**
     * 车辆信息
     */
    private String fVehicleinfo;

    /**
     * 出行时间
     */
    private Date fTime;

    /**
     * 描述
     */
    private String fRemark;


}
