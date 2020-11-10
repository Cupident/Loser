package com.hello.service;

import com.hello.pojo.TInfo;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
public interface ITInfoService 
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
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTInfoByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param iId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTInfoById(Long iId);
}
