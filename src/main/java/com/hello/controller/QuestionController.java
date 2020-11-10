package com.hello.controller;

import java.util.List;

import com.hello.page.TableDataInfo;
import com.hello.pojo.Question;
import com.hello.service.IQuestionService;
import lombok.extern.java.Log;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2020-11-08
 */
@Controller
@RequestMapping("/system/question")
public class QuestionController extends BaseController
{
    private String prefix = "system/question";

    @Autowired
    private IQuestionService questionService;

    @RequiresPermissions("system:question:view")
    @GetMapping()
    public String question()
    {
        return prefix + "/question";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:question:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Question question)
    {
        startPage();
        List<Question> list = questionService.selectQuestionList(question);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @RequiresPermissions("system:question:export")
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(Question question)
//    {
//        List<Question> list = questionService.selectQuestionList(question);
//        ExcelUtil<Question> util = new ExcelUtil<Question>(Question.class);
//        return util.exportExcel(list, "question");
//    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:question:add")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Question question)
    {
        return toAjax(questionService.insertQuestion(question));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{pId}")
    public String edit(@PathVariable("pId") Long pId, ModelMap mmap)
    {
        Question question = questionService.selectQuestionById(pId);
        mmap.put("question", question);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:question:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Question question)
    {
        return toAjax(questionService.updateQuestion(question));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:question:remove")
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(questionService.deleteQuestionByIds(ids));
    }
}
