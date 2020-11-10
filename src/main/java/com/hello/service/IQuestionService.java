package com.hello.service;

import java.util.List;

import com.hello.pojo.Question;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
public interface IQuestionService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param pId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Question selectQuestionById(Long pId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param question 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Question> selectQuestionList(Question question);

    /**
     * 新增【请填写功能名称】
     * 
     * @param question 【请填写功能名称】
     * @return 结果
     */
    public int insertQuestion(Question question);

    /**
     * 修改【请填写功能名称】
     * 
     * @param question 【请填写功能名称】
     * @return 结果
     */
    public int updateQuestion(Question question);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteQuestionByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param pId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteQuestionById(Long pId);
}
