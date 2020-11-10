package com.hello.service;

import com.hello.pojo.BusTeam;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
public interface IBusTeamService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param busId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BusTeam selectBusTeamById(Long busId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busTeam 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BusTeam> selectBusTeamList(BusTeam busTeam);

    /**
     * 新增【请填写功能名称】
     * 
     * @param busTeam 【请填写功能名称】
     * @return 结果
     */
    public int insertBusTeam(BusTeam busTeam);

    /**
     * 修改【请填写功能名称】
     * 
     * @param busTeam 【请填写功能名称】
     * @return 结果
     */
    public int updateBusTeam(BusTeam busTeam);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusTeamByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param busId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBusTeamById(Long busId);
}
