package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.entity.AppUsers;
import com.app.secret.services.AppUsersService;

@Controller
@RequestMapping(value="/appUsers")
@Api(tags = "用户")
public class AppUsersController extends BaseController<AppUsers, AppUsersService> {
	
}
