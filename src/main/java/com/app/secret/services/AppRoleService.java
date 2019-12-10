package com.app.secret.services;


import com.app.secret.entity.AppRole;

import com.app.secret.core.base.service.BaseService;

import java.util.List;

public interface AppRoleService extends BaseService<AppRole>{
    List<AppRole> selectRolesByUserId(String userId);
}

