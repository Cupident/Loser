package com.hello.pojo;

import java.util.Date;

import com.hello.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 【请填写功能名称】对象 question_back
 * 
 * @author pfx
 * @date 2020-11-08
 */
public class QuestionBack extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 反馈信息的id */
    private Long bId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String backName;

    /** 问题的id */
    @Excel(name = "问题的id")
    private Long pId;

    /** 反馈，一条问题多个反馈 */
    @Excel(name = "反馈，一条问题多个反馈")
    private String backquestion;

    /** $column.columnComment */
    @Excel(name = "反馈，一条问题多个反馈", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bDate;

    public void setbId(Long bId) 
    {
        this.bId = bId;
    }

    public Long getbId() 
    {
        return bId;
    }
    public void setBackName(String backName) 
    {
        this.backName = backName;
    }

    public String getBackName() 
    {
        return backName;
    }
    public void setpId(Long pId) 
    {
        this.pId = pId;
    }

    public Long getpId() 
    {
        return pId;
    }
    public void setBackquestion(String backquestion) 
    {
        this.backquestion = backquestion;
    }

    public String getBackquestion() 
    {
        return backquestion;
    }
    public void setbDate(Date bDate) 
    {
        this.bDate = bDate;
    }

    public Date getbDate() 
    {
        return bDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("bId", getbId())
            .append("backName", getBackName())
            .append("pId", getpId())
            .append("backquestion", getBackquestion())
            .append("bDate", getbDate())
            .toString();
    }
}
