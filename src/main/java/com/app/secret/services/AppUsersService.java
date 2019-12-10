package com.app.secret.services;


import com.app.secret.entity.AppUsers;

import com.app.secret.core.base.service.BaseService;
import com.app.secret.entity.TokenUsers;

public interface AppUsersService extends BaseService<AppUsers>{

    AppUsers loadAppUserByUserCode(String userCode);

    TokenUsers loadUserByUserCode(String userCode, String password);

}

