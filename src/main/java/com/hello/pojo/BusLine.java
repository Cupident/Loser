package com.hello.pojo;

import java.util.Date;

import com.hello.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 【请填写功能名称】对象 bus_line
 * 
 * @author pfx
 * @date 2020-11-08
 */
public class BusLine extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 线路编号 */
    private Long lineId;

    /** 线路名称 */
    @Excel(name = "线路名称")
    private String lineName;

    /** $column.columnComment */
    @Excel(name = "线路名称")
    private Long comNumber;

    /** 线路类型 */
    @Excel(name = "线路类型")
    private String lineType;

    /** 上行长度 */
    @Excel(name = "上行长度")
    private Long upLength;

    /** 下行长度 */
    @Excel(name = "下行长度")
    private Long downLength;

    /** 上行首班车 */
    @Excel(name = "上行首班车", width = 30, dateFormat = "yyyy-MM-dd")
    private Date upStarttime;

    /** 上行末班车 */
    @Excel(name = "上行末班车", width = 30, dateFormat = "yyyy-MM-dd")
    private Date upOvertime;

    /** 下行首班车 */
    @Excel(name = "下行首班车", width = 30, dateFormat = "yyyy-MM-dd")
    private Date downStarttime;

    /** 下行末班车时间 */
    @Excel(name = "下行末班车时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date downOvertime;

    /** 状态 1为启用 */
    @Excel(name = "状态 1为启用")
    private Long status;

    public void setLineId(Long lineId) 
    {
        this.lineId = lineId;
    }

    public Long getLineId() 
    {
        return lineId;
    }
    public void setLineName(String lineName) 
    {
        this.lineName = lineName;
    }

    public String getLineName() 
    {
        return lineName;
    }
    public void setComNumber(Long comNumber) 
    {
        this.comNumber = comNumber;
    }

    public Long getComNumber() 
    {
        return comNumber;
    }
    public void setLineType(String lineType) 
    {
        this.lineType = lineType;
    }

    public String getLineType() 
    {
        return lineType;
    }
    public void setUpLength(Long upLength) 
    {
        this.upLength = upLength;
    }

    public Long getUpLength() 
    {
        return upLength;
    }
    public void setDownLength(Long downLength) 
    {
        this.downLength = downLength;
    }

    public Long getDownLength() 
    {
        return downLength;
    }
    public void setUpStarttime(Date upStarttime) 
    {
        this.upStarttime = upStarttime;
    }

    public Date getUpStarttime() 
    {
        return upStarttime;
    }
    public void setUpOvertime(Date upOvertime) 
    {
        this.upOvertime = upOvertime;
    }

    public Date getUpOvertime() 
    {
        return upOvertime;
    }
    public void setDownStarttime(Date downStarttime) 
    {
        this.downStarttime = downStarttime;
    }

    public Date getDownStarttime() 
    {
        return downStarttime;
    }
    public void setDownOvertime(Date downOvertime) 
    {
        this.downOvertime = downOvertime;
    }

    public Date getDownOvertime() 
    {
        return downOvertime;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("lineId", getLineId())
            .append("lineName", getLineName())
            .append("comNumber", getComNumber())
            .append("lineType", getLineType())
            .append("upLength", getUpLength())
            .append("downLength", getDownLength())
            .append("upStarttime", getUpStarttime())
            .append("upOvertime", getUpOvertime())
            .append("downStarttime", getDownStarttime())
            .append("downOvertime", getDownOvertime())
            .append("status", getStatus())
            .toString();
    }
}
