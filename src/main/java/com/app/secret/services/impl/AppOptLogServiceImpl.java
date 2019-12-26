package com.app.secret.services.impl;

import org.springframework.stereotype.Service;
import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.entity.AppOptLog;
import com.app.secret.mapper.AppOptLogMapper;
import com.app.secret.services.AppOptLogService;

@Service
public class AppOptLogServiceImpl extends BaseServiceImpl<AppOptLog, AppOptLogMapper> implements AppOptLogService {

}

