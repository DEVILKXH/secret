package com.app.secret.services.impl;

import com.app.secret.core.util.TokenUtil;
import com.app.secret.entity.TokenUsers;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;
import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.entity.AppUsers;
import com.app.secret.mapper.AppUsersMapper;
import com.app.secret.services.AppUsersService;

@Service
public class AppUsersServiceImpl extends BaseServiceImpl<AppUsers, AppUsersMapper> implements AppUsersService {

    @Override
    public AppUsers loadAppUserByUserCode(String userCode){
        return mapper.loadAppUserByUserCode(userCode);
    }

    @Override
    public TokenUsers loadUserByUserCode(String userCode, String password){
        AppUsers users = mapper.loadAppUserByUserCode(userCode);
        if(users == null) {
            return null;
        }
        if(!users.equals(Algorithm.HMAC256(users.getUserPswd()))) {
            return null;
        }
        return TokenUtil.genderToken(users);
    }
}

