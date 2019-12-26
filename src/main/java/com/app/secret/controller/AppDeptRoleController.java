package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.entity.AppDeptRole;
import com.app.secret.services.AppDeptRoleService;

@Controller
@RequestMapping(value="/appDeptRole")
@Api(tags = "部门-角色")
public class AppDeptRoleController extends BaseController<AppDeptRole, AppDeptRoleService> {
	
}
