package com.hello.service.impl;

import java.util.List;

import com.hello.mapper.QuestionBackMapper;
import com.hello.pojo.QuestionBack;
import com.hello.service.IQuestionBackService;
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
public class QuestionBackServiceImpl implements IQuestionBackService
{
    @Autowired
    private QuestionBackMapper questionBackMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param bId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public QuestionBack selectQuestionBackById(Long bId)
    {
        return questionBackMapper.selectQuestionBackById(bId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param questionBack 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<QuestionBack> selectQuestionBackList(QuestionBack questionBack)
    {
        return questionBackMapper.selectQuestionBackList(questionBack);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param questionBack 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertQuestionBack(QuestionBack questionBack)
    {
        return questionBackMapper.insertQuestionBack(questionBack);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param questionBack 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateQuestionBack(QuestionBack questionBack)
    {
        return questionBackMapper.updateQuestionBack(questionBack);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteQuestionBackByIds(String ids)
    {
        return questionBackMapper.deleteQuestionBackByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param bId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteQuestionBackById(Long bId)
    {
        return questionBackMapper.deleteQuestionBackById(bId);
    }
}
