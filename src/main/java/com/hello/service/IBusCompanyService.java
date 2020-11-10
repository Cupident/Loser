package com.hello.service;

import com.hello.pojo.BusCompany;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
public interface IBusCompanyService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param comId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BusCompany selectBusCompanyById(Long comId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busCompany 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BusCompany> selectBusCompanyList(BusCompany busCompany);

    /**
     * 新增【请填写功能名称】
     * 
     * @param busCompany 【请填写功能名称】
     * @return 结果
     */
    public int insertBusCompany(BusCompany busCompany);

    /**
     * 修改【请填写功能名称】
     * 
     * @param busCompany 【请填写功能名称】
     * @return 结果
     */
    public int updateBusCompany(BusCompany busCompany);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusCompanyByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param comId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBusCompanyById(Long comId);
}
