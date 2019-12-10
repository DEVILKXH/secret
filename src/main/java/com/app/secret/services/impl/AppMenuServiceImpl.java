package com.app.secret.services.impl;

import com.app.secret.entity.AppRole;
import org.springframework.stereotype.Service;
import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.entity.AppMenu;
import com.app.secret.mapper.AppMenuMapper;
import com.app.secret.services.AppMenuService;

import java.util.List;

@Service
public class AppMenuServiceImpl extends BaseServiceImpl<AppMenu, AppMenuMapper> implements AppMenuService {

    @Override
    public List<AppMenu> selectMenuByRoleId(List<AppRole> roles){
        return mapper.selectMenuByRoleId(roles);
    }
}

