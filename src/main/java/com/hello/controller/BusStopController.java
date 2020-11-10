package com.hello.controller;

import java.util.List;

import com.hello.page.TableDataInfo;
import com.hello.pojo.BusStop;
import com.hello.service.IBusStopService;
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
@RequestMapping("/system/stop")
public class BusStopController extends BaseController
{
    private String prefix = "system/stop";

    @Autowired
    private IBusStopService busStopService;

    @RequiresPermissions("system:stop:view")
    @GetMapping()
    public String stop()
    {
        return prefix + "/stop";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:stop:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusStop busStop)
    {
        startPage();
        List<BusStop> list = busStopService.selectBusStopList(busStop);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @RequiresPermissions("system:stop:export")
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(BusStop busStop)
//    {
//        List<BusStop> list = busStopService.selectBusStopList(busStop);
//        ExcelUtil<BusStop> util = new ExcelUtil<BusStop>(BusStop.class);
//        return util.exportExcel(list, "stop");
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
    @RequiresPermissions("system:stop:add")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BusStop busStop)
    {
        return toAjax(busStopService.insertBusStop(busStop));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{stopId}")
    public String edit(@PathVariable("stopId") Long stopId, ModelMap mmap)
    {
        BusStop busStop = busStopService.selectBusStopById(stopId);
        mmap.put("busStop", busStop);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:stop:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BusStop busStop)
    {
        return toAjax(busStopService.updateBusStop(busStop));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:stop:remove")
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(busStopService.deleteBusStopByIds(ids));
    }
}
