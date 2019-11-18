package com.app.secret.services.impl;

import org.springframework.stereotype.Service;
import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.entity.AppMenu;
import com.app.secret.mapper.AppMenuMapper;
import com.app.secret.services.AppMenuService;

@Service
public class AppMenuServiceImpl extends BaseServiceImpl<AppMenu, AppMenuMapper> implements AppMenuService {

}

