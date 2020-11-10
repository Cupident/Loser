package com.hello.controller;

import java.util.List;

import com.hello.page.TableDataInfo;
import com.hello.pojo.BusCompany;
import com.hello.service.IBusCompanyService;
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
@RequestMapping("/system/company")
public class BusCompanyController extends BaseController
{
    private String prefix = "system/company";

    @Autowired
    private IBusCompanyService busCompanyService;

    @RequiresPermissions("system:company:view")
    @GetMapping()
    public String company()
    {
        return prefix + "/company";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusCompany busCompany) throws Exception {
        startPage();
        List<BusCompany> list = busCompanyService.selectBusCompanyList(busCompany);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(BusCompany busCompany)
//    {
//        List<BusCompany> list = busCompanyService.selectBusCompanyList(busCompany);
//        ExcelUtil<BusCompany> util = new ExcelUtil<BusCompany>(BusCompany.class);
//        return util.exportExcel(list, "company");
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
    public AjaxResult addSave(BusCompany busCompany)
    {
        return toAjax(busCompanyService.insertBusCompany(busCompany));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{comId}")
    public String edit(@PathVariable("comId") Long comId, ModelMap mmap)
    {
        BusCompany busCompany = busCompanyService.selectBusCompanyById(comId);
        mmap.put("busCompany", busCompany);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BusCompany busCompany)
    {
        return toAjax(busCompanyService.updateBusCompany(busCompany));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(busCompanyService.deleteBusCompanyByIds(ids));
    }
}
