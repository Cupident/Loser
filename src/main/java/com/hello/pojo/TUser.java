package com.hello.pojo;

import com.hello.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 【请填写功能名称】对象 t_user
 * 
 * @author pfx
 * @date 2020-11-08
 */
public class TUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    private Long uId;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String userName;

    /** 用户密码 */
    @Excel(name = "用户密码")
    private String password;

    /** 区分身份 */
    @Excel(name = "区分身份")
    private String name;

    public void setuId(Long uId) 
    {
        this.uId = uId;
    }

    public Long getuId() 
    {
        return uId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("uId", getuId())
            .append("userName", getUserName())
            .append("password", getPassword())
            .append("name", getName())
            .toString();
    }
}
