package com.app.secret.services.impl;

import org.springframework.stereotype.Service;
import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.entity.AppRole;
import com.app.secret.mapper.AppRoleMapper;
import com.app.secret.services.AppRoleService;

import java.util.List;

@Service
public class AppRoleServiceImpl extends BaseServiceImpl<AppRole, AppRoleMapper> implements AppRoleService {

    @Override
    public List<AppRole> selectRolesByUserId(String userId){
        return mapper.selectRolesByUserId(userId);
    }
}

