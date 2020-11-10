package com.hello.controller;

import java.util.List;

import com.hello.page.TableDataInfo;
import com.hello.pojo.BusTeam;
import com.hello.service.IBusTeamService;
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
@RequestMapping("/system/team")
public class BusTeamController extends BaseController
{
    private String prefix = "system/team";

    @Autowired
    private IBusTeamService busTeamService;

    @RequiresPermissions("system:team:view")
    @GetMapping()
    public String team()
    {
        return prefix + "/team";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @ResponseBody
    public TableDataInfo list(BusTeam busTeam)
    {
        startPage();
        List<BusTeam> list = busTeamService.selectBusTeamList(busTeam);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(BusTeam busTeam)
//    {
//        List<BusTeam> list = busTeamService.selectBusTeamList(busTeam);
//        ExcelUtil<BusTeam> util = new ExcelUtil<BusTeam>(BusTeam.class);
//        return util.exportExcel(list, "team");
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
    public AjaxResult addSave(BusTeam busTeam)
    {
        return toAjax(busTeamService.insertBusTeam(busTeam));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{busId}")
    public String edit(@PathVariable("busId") Long busId, ModelMap mmap)
    {
        BusTeam busTeam = busTeamService.selectBusTeamById(busId);
        mmap.put("busTeam", busTeam);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BusTeam busTeam)
    {
        return toAjax(busTeamService.updateBusTeam(busTeam));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(busTeamService.deleteBusTeamByIds(ids));
    }
}
