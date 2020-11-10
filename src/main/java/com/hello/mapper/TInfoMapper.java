package com.hello.mapper;

import com.hello.pojo.TInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author pfx
 * @date 2020-11-08
 */
@Mapper
public interface TInfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param iId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TInfo selectTInfoById(Long iId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TInfo> selectTInfoList(TInfo tInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertTInfo(TInfo tInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateTInfo(TInfo tInfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param iId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTInfoById(Long iId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param iIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTInfoByIds(String[] iIds);
}
