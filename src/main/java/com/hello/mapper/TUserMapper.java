package com.hello.mapper;

import com.hello.pojo.TUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author pfx
 * @date 2020-11-08
 */
@Mapper
public interface TUserMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param uId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTUserById(Long uId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param uIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTUserByIds(String[] uIds);
}
