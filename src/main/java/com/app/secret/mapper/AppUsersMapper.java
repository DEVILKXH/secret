package com.app.secret.mapper;

import com.app.secret.entity.AppTags;
import com.app.secret.entity.AppUserTag;
import com.app.secret.entity.AppUsers;
import com.app.secret.core.base.mapper.BaseMapper;

import java.util.List;

public interface AppUsersMapper extends BaseMapper<AppUsers>{
    AppUsers loadAppUserByUserCode(String userCode);

    int deleteTagByUserId(String userId);

    int saveUserTag(List<AppUserTag> list);

    List<AppUserTag> getUserTagByUserId(String userId);
}

