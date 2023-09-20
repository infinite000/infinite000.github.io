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
public class TbTrajectory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 轨迹id
     */
    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    /**
     * 用户id
     */
    private Integer fUserid;

    /**
     * 经度
     */
    private Double fLong;

    /**
     * 纬度
     */
    private Double fLat;

    /**
     * 高程
     */
    private Double fZ;

    /**
     * 采集时间
     */
    private Date fTime;

    /**
     * 描述
     */
    private String fDescribe;


}
