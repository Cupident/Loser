package com.hello.service.impl;

import java.util.List;

import com.hello.mapper.BusLineMapper;
import com.hello.pojo.BusLine;
import com.hello.service.IBusLineService;
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
public class BusLineServiceImpl implements IBusLineService
{
    @Autowired
    private BusLineMapper busLineMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param lineId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BusLine selectBusLineById(Long lineId)
    {
        return busLineMapper.selectBusLineById(lineId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busLine 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BusLine> selectBusLineList(BusLine busLine)
    {
        return busLineMapper.selectBusLineList(busLine);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param busLine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBusLine(BusLine busLine)
    {
        return busLineMapper.insertBusLine(busLine);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param busLine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBusLine(BusLine busLine)
    {
        return busLineMapper.updateBusLine(busLine);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBusLineByIds(String ids)
    {
        return busLineMapper.deleteBusLineByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param lineId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBusLineById(Long lineId)
    {
        return busLineMapper.deleteBusLineById(lineId);
    }
}
