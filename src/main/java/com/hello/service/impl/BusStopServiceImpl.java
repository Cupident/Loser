package com.hello.service.impl;

import java.util.List;

import com.hello.mapper.BusStopMapper;
import com.hello.pojo.BusStop;
import com.hello.service.IBusStopService;
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
public class BusStopServiceImpl implements IBusStopService
{
    @Autowired
    private BusStopMapper busStopMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param stopId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BusStop selectBusStopById(Long stopId)
    {
        return busStopMapper.selectBusStopById(stopId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busStop 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BusStop> selectBusStopList(BusStop busStop)
    {
        return busStopMapper.selectBusStopList(busStop);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param busStop 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBusStop(BusStop busStop)
    {
        return busStopMapper.insertBusStop(busStop);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param busStop 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBusStop(BusStop busStop)
    {
        return busStopMapper.updateBusStop(busStop);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBusStopByIds(String ids)
    {
        return busStopMapper.deleteBusStopByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param stopId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBusStopById(Long stopId)
    {
        return busStopMapper.deleteBusStopById(stopId);
    }
}
