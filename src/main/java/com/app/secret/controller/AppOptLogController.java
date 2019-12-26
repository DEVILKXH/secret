package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.entity.AppOptLog;
import com.app.secret.services.AppOptLogService;

@Controller
@RequestMapping(value="/appOptLog")
@Api(tags = "操作日志")
public class AppOptLogController extends BaseController<AppOptLog, AppOptLogService> {
	
}
