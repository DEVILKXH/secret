package com.app.secret.controller;

import com.app.secret.core.util.UsersUtil;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.entity.AppMobile;
import com.app.secret.services.AppMobileService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/appMobile")
@Api(tags = "电话")
public class AppMobileController extends BaseController<AppMobile, AppMobileService> {

    @RequestMapping(value = "/getQueryByPage.do", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "分页数据")
    @ApiImplicitParam(name = "token", value = "token", dataType = "String", paramType = "header", required = true)
    @Override
    public PageInfo<AppMobile> getQueryByPage(AppMobile record, PageInfo<AppMobile> page){
        return service.getQueryByPage(record, page);
    }

}
