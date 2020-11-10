package com.hello.mapper;

import java.util.List;

import com.hello.pojo.BusLine;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author pfx
 * @date 2020-11-08
 */
@Mapper
public interface BusLineMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param lineId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBusLineById(Long lineId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param lineIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusLineByIds(String[] lineIds);
}
