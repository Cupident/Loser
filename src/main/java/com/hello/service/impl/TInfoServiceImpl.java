package com.hello.service.impl;

import java.util.List;

import com.hello.mapper.TInfoMapper;
import com.hello.pojo.TInfo;
import com.hello.service.ITInfoService;
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
public class TInfoServiceImpl implements ITInfoService
{
    @Autowired
    private TInfoMapper tInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param iId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TInfo selectTInfoById(Long iId)
    {
        return tInfoMapper.selectTInfoById(iId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TInfo> selectTInfoList(TInfo tInfo)
    {
        return tInfoMapper.selectTInfoList(tInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTInfo(TInfo tInfo)
    {
        return tInfoMapper.insertTInfo(tInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTInfo(TInfo tInfo)
    {
        return tInfoMapper.updateTInfo(tInfo);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTInfoByIds(String ids)
    {
        return tInfoMapper.deleteTInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param iId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTInfoById(Long iId)
    {
        return tInfoMapper.deleteTInfoById(iId);
    }
}
