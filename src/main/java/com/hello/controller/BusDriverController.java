package com.hello.controller;

import java.util.List;

import com.hello.page.TableDataInfo;
import com.hello.pojo.BusDriver;
import com.hello.service.IBusDriverService;
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
@RequestMapping("/system/driver")
public class BusDriverController extends BaseController
{
    private String prefix = "system/driver";

    @Autowired
    private IBusDriverService busDriverService;

    @GetMapping()
    public String driver()
    {
        return prefix + "/driver";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:driver:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusDriver busDriver) throws Exception {
        startPage();
        List<BusDriver> list = busDriverService.selectBusDriverList(busDriver);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(BusDriver busDriver)
//    {
//        List<BusDriver> list = busDriverService.selectBusDriverList(busDriver);
//        ExcelUtil<BusDriver> util = new ExcelUtil<BusDriver>(BusDriver.class);
//        return util.exportExcel(list, "driver");
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
    public AjaxResult addSave(BusDriver busDriver)
    {
        return toAjax(busDriverService.insertBusDriver(busDriver));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{drId}")
    public String edit(@PathVariable("drId") Long drId, ModelMap mmap)
    {
        BusDriver busDriver = busDriverService.selectBusDriverById(drId);
        mmap.put("busDriver", busDriver);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:driver:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BusDriver busDriver)
    {
        return toAjax(busDriverService.updateBusDriver(busDriver));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:driver:remove")
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(busDriverService.deleteBusDriverByIds(ids));
    }
}
