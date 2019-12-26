package com.app.secret.services;


import com.app.secret.core.vo.AjaxResult;
import com.app.secret.entity.AppUserTag;
import com.app.secret.entity.AppUsers;

import com.app.secret.core.base.service.BaseService;
import com.app.secret.entity.TokenUsers;

import java.util.List;

public interface AppUsersService extends BaseService<AppUsers>{

    AppUsers loadAppUserByUserCode(String userCode);

    TokenUsers loadUserByUserCode(String userCode, String password);

    AjaxResult<AppUsers> saveUserTag(List<AppUserTag> list, String userId);

    AjaxResult<AppUserTag> getUserTagByUserId(String userId);
}

