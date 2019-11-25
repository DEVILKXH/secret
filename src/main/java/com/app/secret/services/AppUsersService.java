package com.app.secret.services;


import com.app.secret.entity.AppUsers;

import com.app.secret.core.base.service.BaseService;
import com.app.secret.entity.TokenUsers;

public interface AppUsersService extends BaseService<AppUsers>{

    public TokenUsers loadUserByUserCode(String userCode);
}

