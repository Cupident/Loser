package com.hello.pojo;

import com.hello.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 【请填写功能名称】对象 bus_stop
 * 
 * @author pfx
 * @date 2020-11-08
 */
public class BusStop extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 站牌编号 */
    private Long stopId;

    /** 站牌名称 */
    @Excel(name = "站牌名称")
    private String stopName;

    /** 站点方向 */
    @Excel(name = "站点方向")
    private String stopDirection;

    /** $column.columnComment */
    @Excel(name = "站点方向")
    private String stopType;

    /** 限制速度 */
    @Excel(name = "限制速度")
    private Long stopSpeed;

    /** 所属县级ID */
    @Excel(name = "所属县级ID")
    private Long stopAreaid;

    /** 状态 1.启用  0.停用 */
    @Excel(name = "状态 1.启用  0.停用")
    private Long stopStatus;

    /** 站点描述 */
    @Excel(name = "站点描述")
    private String stopText;

    /** 是否虚拟 1.是0.否 */
    @Excel(name = "是否虚拟 1.是0.否")
    private Long stopXuni;

    public void setStopId(Long stopId) 
    {
        this.stopId = stopId;
    }

    public Long getStopId() 
    {
        return stopId;
    }
    public void setStopName(String stopName) 
    {
        this.stopName = stopName;
    }

    public String getStopName() 
    {
        return stopName;
    }
    public void setStopDirection(String stopDirection) 
    {
        this.stopDirection = stopDirection;
    }

    public String getStopDirection() 
    {
        return stopDirection;
    }
    public void setStopType(String stopType) 
    {
        this.stopType = stopType;
    }

    public String getStopType() 
    {
        return stopType;
    }
    public void setStopSpeed(Long stopSpeed) 
    {
        this.stopSpeed = stopSpeed;
    }

    public Long getStopSpeed() 
    {
        return stopSpeed;
    }
    public void setStopAreaid(Long stopAreaid) 
    {
        this.stopAreaid = stopAreaid;
    }

    public Long getStopAreaid() 
    {
        return stopAreaid;
    }
    public void setStopStatus(Long stopStatus) 
    {
        this.stopStatus = stopStatus;
    }

    public Long getStopStatus() 
    {
        return stopStatus;
    }
    public void setStopText(String stopText) 
    {
        this.stopText = stopText;
    }

    public String getStopText() 
    {
        return stopText;
    }
    public void setStopXuni(Long stopXuni) 
    {
        this.stopXuni = stopXuni;
    }

    public Long getStopXuni() 
    {
        return stopXuni;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stopId", getStopId())
            .append("stopName", getStopName())
            .append("stopDirection", getStopDirection())
            .append("stopType", getStopType())
            .append("stopSpeed", getStopSpeed())
            .append("stopAreaid", getStopAreaid())
            .append("stopStatus", getStopStatus())
            .append("stopText", getStopText())
            .append("stopXuni", getStopXuni())
            .toString();
    }
}
