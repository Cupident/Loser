package com.hello.service;

import java.util.List;

import com.hello.pojo.TUser;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
public interface ITUserService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param uId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TUser selectTUserById(Long uId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tUser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TUser> selectTUserList(TUser tUser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tUser 【请填写功能名称】
     * @return 结果
     */
    public int insertTUser(TUser tUser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tUser 【请填写功能名称】
     * @return 结果
     */
    public int updateTUser(TUser tUser);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTUserByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param uId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTUserById(Long uId);
}
