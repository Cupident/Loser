package com.hello.controller;

import java.util.List;

import com.hello.page.TableDataInfo;
import com.hello.pojo.QuestionBack;
import com.hello.service.IQuestionBackService;
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
@RequestMapping("/system/back")
public class  QuestionBackController extends BaseController
{
    private String prefix = "system/back";

    @Autowired
    private IQuestionBackService questionBackService;

    @RequiresPermissions("system:back:view")
    @GetMapping()
    public String back()
    {
        return prefix + "/back";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:back:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(QuestionBack questionBack)
    {
        startPage();
        List<QuestionBack> list = questionBackService.selectQuestionBackList(questionBack);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(QuestionBack questionBack)
//    {
//        List<QuestionBack> list = questionBackService.selectQuestionBackList(questionBack);
//        ExcelUtil<QuestionBack> util = new ExcelUtil<QuestionBack>(QuestionBack.class);
//        return util.exportExcel(list, "back");
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
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(QuestionBack questionBack)
    {
        return toAjax(questionBackService.insertQuestionBack(questionBack));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{bId}")
    public String edit(@PathVariable("bId") Long bId, ModelMap mmap)
    {
        QuestionBack questionBack = questionBackService.selectQuestionBackById(bId);
        mmap.put("questionBack", questionBack);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(QuestionBack questionBack)
    {
        return toAjax(questionBackService.updateQuestionBack(questionBack));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(questionBackService.deleteQuestionBackByIds(ids));
    }
}
