package com.hello.mapper;

import com.hello.pojo.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author pfx
 * @date 2020-11-08
 */
@Mapper
public interface QuestionMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param pId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteQuestionById(Long pId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param pIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteQuestionByIds(String[] pIds);
}
