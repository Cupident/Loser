package com.hello.controller;

import java.util.List;

import com.hello.page.TableDataInfo;
import com.hello.pojo.BusLine;
import com.hello.service.IBusLineService;
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
@RequestMapping("/system/line")
public class BusLineController extends BaseController
{
    private String prefix = "system/line";

    @Autowired
    private IBusLineService busLineService;

    @GetMapping()
    public String line()
    {
        return prefix + "/line";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusLine busLine)
    {
        startPage();
        List<BusLine> list = busLineService.selectBusLineList(busLine);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(BusLine busLine)
//    {
//        List<BusLine> list = busLineService.selectBusLineList(busLine);
//        ExcelUtil<BusLine> util = new ExcelUtil<BusLine>(BusLine.class);
//        return util.exportExcel(list, "line");
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
    public AjaxResult addSave(BusLine busLine)
    {
        return toAjax(busLineService.insertBusLine(busLine));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{lineId}")
    public String edit(@PathVariable("lineId") Long lineId, ModelMap mmap)
    {
        BusLine busLine = busLineService.selectBusLineById(lineId);
        mmap.put("busLine", busLine);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BusLine busLine)
    {
        return toAjax(busLineService.updateBusLine(busLine));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(busLineService.deleteBusLineByIds(ids));
    }
}
