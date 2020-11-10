package com.hello.service;

import java.util.List;

import com.hello.pojo.BusLine;
/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
public interface IBusLineService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param lineId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BusLine selectBusLineById(Long lineId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busLine 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BusLine> selectBusLineList(BusLine busLine);

    /**
     * 新增【请填写功能名称】
     * 
     * @param busLine 【请填写功能名称】
     * @return 结果
     */
    public int insertBusLine(BusLine busLine);

    /**
     * 修改【请填写功能名称】
     * 
     * @param busLine 【请填写功能名称】
     * @return 结果
     */
    public int updateBusLine(BusLine busLine);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusLineByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param lineId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBusLineById(Long lineId);
}
