package com.app.secret.services.impl;

import com.app.secret.mapper.AppUsersMapper;
import com.app.secret.services.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailServiceImpl implements MyUserDetailService {

    @Autowired
    AppUsersMapper usersMapper;

//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        AppUsers users = usersMapper.loadUserByUsername("admin");
//        if(null == users) {
//            throw new UsernameNotFoundException("帐号不正确");
//        }
//        TokenUsers tokenUsers = new TokenUsers();
//        tokenUsers.setUuid(users.getUuid());
//        tokenUsers.setUsername(users.getUserCode());
//        tokenUsers.setPassword(users.getUserPswd());
//        return tokenUsers;
//    }
}
