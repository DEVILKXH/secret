package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.entity.AppRoleMenu;
import com.app.secret.services.AppRoleMenuService;

@Controller
@RequestMapping(value="/appRoleMenu")
@Api(tags = "角色-菜单")
public class AppRoleMenuController extends BaseController<AppRoleMenu, AppRoleMenuService> {
	
}
