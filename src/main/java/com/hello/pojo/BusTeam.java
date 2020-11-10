package com.hello.pojo;

import com.hello.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 【请填写功能名称】对象 bus_team
 * 
 * @author pfx
 * @date 2020-11-08
 */
public class BusTeam extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 车队id */
    private Long busId;

    /** 车队名称 */
    @Excel(name = "车队名称")
    private String carname;

    /** 负责人 */
    @Excel(name = "负责人")
    private Long administratorId;

    /** 公司id */
    @Excel(name = "公司id")
    private Long comNumber;

    /** 线路id */
    @Excel(name = "线路id")
    private Long lineId;

    public void setBusId(Long busId) 
    {
        this.busId = busId;
    }

    public Long getBusId() 
    {
        return busId;
    }
    public void setCarname(String carname) 
    {
        this.carname = carname;
    }

    public String getCarname() 
    {
        return carname;
    }
    public void setAdministratorId(Long administratorId) 
    {
        this.administratorId = administratorId;
    }

    public Long getAdministratorId() 
    {
        return administratorId;
    }
    public void setComNumber(Long comNumber) 
    {
        this.comNumber = comNumber;
    }

    public Long getComNumber() 
    {
        return comNumber;
    }
    public void setLineId(Long lineId) 
    {
        this.lineId = lineId;
    }

    public Long getLineId() 
    {
        return lineId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("busId", getBusId())
            .append("carname", getCarname())
            .append("administratorId", getAdministratorId())
            .append("comNumber", getComNumber())
            .append("lineId", getLineId())
            .toString();
    }
}
