package com.hello.mapper;

import java.util.List;

import com.hello.pojo.BusCompany;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author pfx
 * @date 2020-11-08
 */
@Mapper
public interface BusCompanyMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param comId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BusCompany selectBusCompanyById(Long comId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param busCompany 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BusCompany> selectBusCompanyList(BusCompany busCompany);

    /**
     * 新增【请填写功能名称】
     * 
     * @param busCompany 【请填写功能名称】
     * @return 结果
     */
    public int insertBusCompany(BusCompany busCompany);

    /**
     * 修改【请填写功能名称】
     * 
     * @param busCompany 【请填写功能名称】
     * @return 结果
     */
    public int updateBusCompany(BusCompany busCompany);

    /**
     * 删除【请填写功能名称】
     * 
     * @param comId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBusCompanyById(Long comId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param comIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusCompanyByIds(String[] comIds);
}
