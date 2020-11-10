package com.hello.mapper;

import com.hello.pojo.QuestionBack;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author pfx
 * @date 2020-11-08
 */
@Mapper
public interface QuestionBackMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param bId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteQuestionBackById(Long bId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param bIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteQuestionBackByIds(String[] bIds);
}
