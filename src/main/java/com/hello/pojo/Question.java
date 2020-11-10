package com.hello.pojo;

import java.util.Date;

import com.hello.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 【请填写功能名称】对象 question
 * 
 * @author pfx
 * @date 2020-11-08
 */
public class Question extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 问题id */
    private Long pId;

    /** 提问的问题 */
    @Excel(name = "提问的问题")
    private String askquestion;

    /** 问题详情 */
    @Excel(name = "问题详情")
    private String qDetails;

    /** 1是未处理0是处理过 */
    @Excel(name = "1是未处理0是处理过")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "1是未处理0是处理过", width = 30, dateFormat = "yyyy-MM-dd")
    private Date qDate;

    public void setpId(Long pId) 
    {
        this.pId = pId;
    }

    public Long getpId() 
    {
        return pId;
    }
    public void setAskquestion(String askquestion) 
    {
        this.askquestion = askquestion;
    }

    public String getAskquestion() 
    {
        return askquestion;
    }
    public void setqDetails(String qDetails) 
    {
        this.qDetails = qDetails;
    }

    public String getqDetails() 
    {
        return qDetails;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setqDate(Date qDate) 
    {
        this.qDate = qDate;
    }

    public Date getqDate() 
    {
        return qDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pId", getpId())
            .append("askquestion", getAskquestion())
            .append("qDetails", getqDetails())
            .append("status", getStatus())
            .append("qDate", getqDate())
            .toString();
    }
}
