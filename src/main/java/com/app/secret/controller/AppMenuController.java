package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.entity.AppMenu;
import com.app.secret.services.AppMenuService;

@Controller
@RequestMapping(value="/appMenu")
@Api(tags = "菜单")
public class AppMenuController extends BaseController<AppMenu, AppMenuService> {
	
}
