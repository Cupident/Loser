package com.hello.service;

import java.util.List;

import com.hello.pojo.QuestionBack;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
public interface IQuestionBackService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param bId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public QuestionBack selectQuestionBackById(Long bId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param questionBack 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<QuestionBack> selectQuestionBackList(QuestionBack questionBack);

    /**
     * 新增【请填写功能名称】
     * 
     * @param questionBack 【请填写功能名称】
     * @return 结果
     */
    public int insertQuestionBack(QuestionBack questionBack);

    /**
     * 修改【请填写功能名称】
     * 
     * @param questionBack 【请填写功能名称】
     * @return 结果
     */
    public int updateQuestionBack(QuestionBack questionBack);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteQuestionBackByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param bId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteQuestionBackById(Long bId);
}
