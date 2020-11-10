package com.hello.mapper;

import com.hello.pojo.BusTeam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author pfx
 * @date 2020-11-08
 */
@Mapper
public interface BusTeamMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param busId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBusTeamById(Long busId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param busIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusTeamByIds(String[] busIds);
}
