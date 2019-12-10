package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.entity.AppDept;
import com.app.secret.services.AppDeptService;

@Controller
@RequestMapping(value="/appDept")
@Api(tags = "部门")
public class AppDeptController extends BaseController<AppDept, AppDeptService> {
	
}
