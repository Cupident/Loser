package com.hello.controller;

import java.util.List;

import com.hello.page.TableDataInfo;
import com.hello.pojo.TUser;
import com.hello.service.ITUserService;

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
 * @author pfx
 * @date 2020-11-08
 */
@Controller
@RequestMapping("/system/user")
public class TUserController extends BaseController {
    private String prefix = "system/user";

    @Autowired
    private ITUserService tUserService;

    @RequiresPermissions("system:user:view")
    @GetMapping()
    public String user() {
        return prefix + "/user";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:user:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TUser tUser) {
        startPage();
        List<TUser> list = tUserService.selectTUserList(tUser);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @RequiresPermissions("system:user:export")
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(TUser tUser) {
//        List<TUser> list = tUserService.selectTUserList(tUser);
//        ExcelUtil<TUser> util = new ExcelUtil<TUser>(TUser.class);
//        return util.exportExcel(list, "user");
//    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:user:add")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TUser tUser) {
        return toAjax(tUserService.insertTUser(tUser));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{uId}")
    public String edit(@PathVariable("uId") Long uId, ModelMap mmap) {
        TUser tUser = tUserService.selectTUserById(uId);
        mmap.put("tUser", tUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:user:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TUser tUser) {
        return toAjax(tUserService.updateTUser(tUser));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:user:remove")
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tUserService.deleteTUserByIds(ids));
    }
}
