package com.hello.pojo;

import com.hello.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 【请填写功能名称】对象 bus_driver
 * 
 * @author pfx
 * @date 2020-11-08
 */
public class BusDriver extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 司机id */
    private Long drId;

    /** 司机名字 */
    @Excel(name = "司机名字")
    private String drName;

    /** 司机电话 */
    @Excel(name = "司机电话")
    private String drTel;

    /** 是否在岗 0 不在 */
    @Excel(name = "是否在岗 0 不在")
    private Integer status;

    public void setDrId(Long drId) 
    {
        this.drId = drId;
    }

    public Long getDrId() 
    {
        return drId;
    }
    public void setDrName(String drName) 
    {
        this.drName = drName;
    }

    public String getDrName() 
    {
        return drName;
    }
    public void setDrTel(String drTel) 
    {
        this.drTel = drTel;
    }

    public String getDrTel() 
    {
        return drTel;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("drId", getDrId())
            .append("drName", getDrName())
            .append("drTel", getDrTel())
            .append("status", getStatus())
            .toString();
    }
}
