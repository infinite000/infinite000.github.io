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
public class TbTravelTrajectory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 轨迹id
     */
    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    /**
     * 出行id
     */
    private Integer fTravelid;

    /**
     * 经度
     */
    private Double fLong;

    /**
     * 维度
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


}
