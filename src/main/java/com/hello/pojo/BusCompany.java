package com.hello.pojo;

import com.hello.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 【请填写功能名称】对象 bus_company
 * 
 * @author pfx
 * @date 2020-11-08
 */
public class BusCompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 公司id编号 */
    private Long comId;

    /** 公司编号 */
    @Excel(name = "公司编号")
    private Long comNumber;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String comName;

    /** 属于哪个城市 */
    @Excel(name = "属于哪个城市")
    private String cityId;

    /** 练习电话 */
    @Excel(name = "练习电话")
    private String phone;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String address;

    public void setComId(Long comId) 
    {
        this.comId = comId;
    }

    public Long getComId() 
    {
        return comId;
    }
    public void setComNumber(Long comNumber) 
    {
        this.comNumber = comNumber;
    }

    public Long getComNumber() 
    {
        return comNumber;
    }
    public void setComName(String comName) 
    {
        this.comName = comName;
    }

    public String getComName() 
    {
        return comName;
    }
    public void setCityId(String cityId) 
    {
        this.cityId = cityId;
    }

    public String getCityId() 
    {
        return cityId;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("comId", getComId())
            .append("comNumber", getComNumber())
            .append("comName", getComName())
            .append("cityId", getCityId())
            .append("phone", getPhone())
            .append("address", getAddress())
            .toString();
    }
}
