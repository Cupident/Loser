package com.hello.service.impl;

import java.util.List;

import com.hello.mapper.BusDriverMapper;
import com.hello.pojo.BusDriver;
import com.hello.service.IBusDriverService;
import com.hello.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
@Service
public class BusDriverServiceImpl implements IBusDriverService
{
    @Autowired
    private BusDriverMapper busDriverMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param drId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BusDriver selectBusDriverById(Long drId)
    {
        return busDriverMapper.selectBusDriverById(drId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busDriver 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BusDriver> selectBusDriverList(BusDriver busDriver)
    {
        return busDriverMapper.selectBusDriverList(busDriver);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param busDriver 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBusDriver(BusDriver busDriver)
    {
        return busDriverMapper.insertBusDriver(busDriver);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param busDriver 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBusDriver(BusDriver busDriver)
    {
        return busDriverMapper.updateBusDriver(busDriver);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBusDriverByIds(String ids)
    {
        return busDriverMapper.deleteBusDriverByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param drId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBusDriverById(Long drId)
    {
        return busDriverMapper.deleteBusDriverById(drId);
    }
}
