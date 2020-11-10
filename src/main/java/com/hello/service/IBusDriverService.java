package com.hello.service;

import java.util.List;

import com.hello.pojo.BusDriver;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
public interface IBusDriverService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param drId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BusDriver selectBusDriverById(Long drId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busDriver 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BusDriver> selectBusDriverList(BusDriver busDriver);

    /**
     * 新增【请填写功能名称】
     * 
     * @param busDriver 【请填写功能名称】
     * @return 结果
     */
    public int insertBusDriver(BusDriver busDriver);

    /**
     * 修改【请填写功能名称】
     * 
     * @param busDriver 【请填写功能名称】
     * @return 结果
     */
    public int updateBusDriver(BusDriver busDriver);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusDriverByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param drId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBusDriverById(Long drId);
}
