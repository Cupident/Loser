package com.hello.pojo;

import java.util.Date;

import com.hello.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 t_info
 * 
 * @author pfx
 * @date 2020-11-08
 */
public class TInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 信息id */
    private Long iId;

    /** 区分失物招领交通新闻等各个模块 */
    @Excel(name = "区分失物招领交通新闻等各个模块")
    private String cata;

    /** 信息标题 */
    @Excel(name = "信息标题")
    private String title;

    /** 信息内容 */
    @Excel(name = "信息内容")
    private String content;

    /** 时间 */
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** pic图片路径 */
    @Excel(name = "pic图片路径")
    private String pic;

    /** $column.columnComment */
    @Excel(name = "pic图片路径")
    private String author;

    /** $column.columnComment */
    @Excel(name = "pic图片路径")
    private String tel;

    /** 1是已经发布0是未发布 */
    @Excel(name = "1是已经发布0是未发布")
    private Integer status;

    /** 寻物/招领/信息 */
    @Excel(name = "寻物/招领/信息")
    private String type;

    public void setiId(Long iId) 
    {
        this.iId = iId;
    }

    public Long getiId() 
    {
        return iId;
    }
    public void setCata(String cata) 
    {
        this.cata = cata;
    }

    public String getCata() 
    {
        return cata;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setPic(String pic) 
    {
        this.pic = pic;
    }

    public String getPic() 
    {
        return pic;
    }
    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("iId", getiId())
            .append("cata", getCata())
            .append("title", getTitle())
            .append("content", getContent())
            .append("time", getTime())
            .append("pic", getPic())
            .append("author", getAuthor())
            .append("tel", getTel())
            .append("status", getStatus())
            .append("type", getType())
            .toString();
    }
}
