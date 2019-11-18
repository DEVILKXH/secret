package com.app.secret.services.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.entity.AppUsers;
import com.app.secret.mapper.AppUsersMapper;
import com.app.secret.services.AppUsersService;

@Service
public class AppUsersServiceImpl extends BaseServiceImpl<AppUsers, AppUsersMapper> implements AppUsersService {


}

