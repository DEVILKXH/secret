package com.app.secret.services.impl;

import com.app.secret.entity.AppUsers;
import com.app.secret.mapper.AppUsersMapper;
import com.app.secret.services.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailServiceImpl implements MyUserDetailService {

    @Autowired
    AppUsersMapper usersMapper;

    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        AppUsers users = usersMapper.loadUserByUsername(userName);
        if(null == users) {
            throw new UsernameNotFoundException("帐号不正确");
        }
        return null;
    }
}
