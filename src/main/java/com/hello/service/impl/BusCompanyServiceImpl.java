package com.hello.service.impl;

import java.util.List;

import com.hello.mapper.BusCompanyMapper;
import com.hello.pojo.BusCompany;
import com.hello.service.IBusCompanyService;
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
public class BusCompanyServiceImpl implements IBusCompanyService {
    @Autowired
    private BusCompanyMapper busCompanyMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param comId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BusCompany selectBusCompanyById(Long comId) {
        return busCompanyMapper.selectBusCompanyById(comId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param busCompany 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BusCompany> selectBusCompanyList(BusCompany busCompany) {
        return busCompanyMapper.selectBusCompanyList(busCompany);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param busCompany 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBusCompany(BusCompany busCompany) {
        return busCompanyMapper.insertBusCompany(busCompany);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param busCompany 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBusCompany(BusCompany busCompany) {
        return busCompanyMapper.updateBusCompany(busCompany);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBusCompanyByIds(String ids) {
        return busCompanyMapper.deleteBusCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param comId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBusCompanyById(Long comId) {
        return busCompanyMapper.deleteBusCompanyById(comId);
    }
}
