package com.app.secret.services.impl;

import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.core.util.TokenUtil;
import com.app.secret.entity.AppUsers;
import com.app.secret.entity.TokenUsers;
import com.app.secret.mapper.AppUsersMapper;
import com.app.secret.services.AppUsersService;
import org.springframework.stereotype.Service;

@Service
public class AppUsersServiceImpl extends BaseServiceImpl<AppUsers, AppUsersMapper> implements AppUsersService {

    @Override
    public TokenUsers loadUserByUserCode(String userCode) {
        AppUsers users = mapper.loadUserByUserCode(userCode);
        return TokenUtil.genderToken(users);
    }
}

