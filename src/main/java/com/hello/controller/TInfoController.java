package com.hello.controller;

import java.util.List;

import com.hello.page.TableDataInfo;
import com.hello.pojo.TInfo;
import com.hello.service.ITInfoService;
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
@RequestMapping("/system/info")
public class TInfoController extends BaseController
{
    private String prefix = "system/info";

    @Autowired
    private ITInfoService tInfoService;

    @RequiresPermissions("system:info:view")
    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:info:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TInfo tInfo)
    {
        startPage();
        List<TInfo> list = tInfoService.selectTInfoList(tInfo);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(TInfo tInfo)
//    {
//        List<TInfo> list = tInfoService.selectTInfoList(tInfo);
//        ExcelUtil<TInfo> util = new ExcelUtil<TInfo>(TInfo.class);
//        return util.exportExcel(list, "info");
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
    public AjaxResult addSave(TInfo tInfo)
    {
        return toAjax(tInfoService.insertTInfo(tInfo));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{iId}")
    public String edit(@PathVariable("iId") Long iId, ModelMap mmap)
    {
        TInfo tInfo = tInfoService.selectTInfoById(iId);
        mmap.put("tInfo", tInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TInfo tInfo)
    {
        return toAjax(tInfoService.updateTInfo(tInfo));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tInfoService.deleteTInfoByIds(ids));
    }
}
