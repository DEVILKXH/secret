package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.entity.AppSystemLog;
import com.app.secret.services.AppSystemLogService;

@Controller
@RequestMapping(value="/appSystemLog")
@Api(tags = "系统日志")
public class AppSystemLogController extends BaseController<AppSystemLog, AppSystemLogService> {
	
}
