package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.entity.AppRole;
import com.app.secret.services.AppRoleService;

@Controller
@RequestMapping(value="/appRole")
@Api(tags = "角色")
public class AppRoleController extends BaseController<AppRole, AppRoleService> {
	
}
