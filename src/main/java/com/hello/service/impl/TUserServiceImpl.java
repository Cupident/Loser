package com.hello.service.impl;

import java.util.List;

import com.hello.mapper.TUserMapper;
import com.hello.pojo.TUser;
import com.hello.service.ITUserService;
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
public class TUserServiceImpl implements ITUserService
{
    @Autowired
    private TUserMapper tUserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param uId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TUser selectTUserById(Long uId)
    {
        return tUserMapper.selectTUserById(uId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TUser> selectTUserList(TUser tUser)
    {
        return tUserMapper.selectTUserList(tUser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTUser(TUser tUser)
    {
        return tUserMapper.insertTUser(tUser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTUser(TUser tUser)
    {
        return tUserMapper.updateTUser(tUser);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTUserByIds(String ids)
    {
        return tUserMapper.deleteTUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param uId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTUserById(Long uId)
    {
        return tUserMapper.deleteTUserById(uId);
    }
}
