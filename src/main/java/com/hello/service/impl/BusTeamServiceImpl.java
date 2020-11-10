package com.hello.service.impl;

import java.util.List;

import com.hello.mapper.BusTeamMapper;
import com.hello.pojo.BusTeam;
import com.hello.service.IBusTeamService;
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
public class BusTeamServiceImpl implements IBusTeamService
{
    @Autowired
    private BusTeamMapper busTeamMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param busId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BusTeam selectBusTeamById(Long busId)
    {
        return busTeamMapper.selectBusTeamById(busId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busTeam 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BusTeam> selectBusTeamList(BusTeam busTeam)
    {
        return busTeamMapper.selectBusTeamList(busTeam);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param busTeam 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBusTeam(BusTeam busTeam)
    {
        return busTeamMapper.insertBusTeam(busTeam);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param busTeam 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBusTeam(BusTeam busTeam)
    {
        return busTeamMapper.updateBusTeam(busTeam);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBusTeamByIds(String ids)
    {
        return busTeamMapper.deleteBusTeamByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param busId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBusTeamById(Long busId)
    {
        return busTeamMapper.deleteBusTeamById(busId);
    }
}
