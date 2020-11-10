package com.hello.service;

import com.hello.pojo.BusStop;

import java.util.List;


/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
public interface IBusStopService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param stopId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BusStop selectBusStopById(Long stopId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busStop 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BusStop> selectBusStopList(BusStop busStop);

    /**
     * 新增【请填写功能名称】
     * 
     * @param busStop 【请填写功能名称】
     * @return 结果
     */
    public int insertBusStop(BusStop busStop);

    /**
     * 修改【请填写功能名称】
     * 
     * @param busStop 【请填写功能名称】
     * @return 结果
     */
    public int updateBusStop(BusStop busStop);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusStopByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param stopId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBusStopById(Long stopId);
}
