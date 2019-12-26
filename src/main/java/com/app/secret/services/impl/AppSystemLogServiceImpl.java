package com.app.secret.services.impl;

import org.springframework.stereotype.Service;
import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.entity.AppSystemLog;
import com.app.secret.mapper.AppSystemLogMapper;
import com.app.secret.services.AppSystemLogService;

@Service
public class AppSystemLogServiceImpl extends BaseServiceImpl<AppSystemLog, AppSystemLogMapper> implements AppSystemLogService {

}

