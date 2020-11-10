package com.hello.mapper;

import java.util.List;

import com.hello.pojo.BusDriver;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author pfx
 * @date 2020-11-08
 */
@Mapper
public interface BusDriverMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param drId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBusDriverById(Long drId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param drIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusDriverByIds(String[] drIds);
}
