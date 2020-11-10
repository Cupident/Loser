package com.hello.service.impl;

import java.util.List;

import com.hello.mapper.QuestionMapper;
import com.hello.pojo.Question;
import com.hello.service.IQuestionService;
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
public class QuestionServiceImpl implements IQuestionService
{
    @Autowired
    private QuestionMapper questionMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param pId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Question selectQuestionById(Long pId)
    {
        return questionMapper.selectQuestionById(pId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param question 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Question> selectQuestionList(Question question)
    {
        return questionMapper.selectQuestionList(question);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param question 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertQuestion(Question question)
    {
        return questionMapper.insertQuestion(question);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param question 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateQuestion(Question question)
    {
        return questionMapper.updateQuestion(question);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteQuestionByIds(String ids)
    {
        return questionMapper.deleteQuestionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param pId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteQuestionById(Long pId)
    {
        return questionMapper.deleteQuestionById(pId);
    }
}
