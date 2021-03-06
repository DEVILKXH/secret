package com.app.secret.mapper;

import com.app.secret.entity.AppRole;
import com.app.secret.core.base.mapper.BaseMapper;

import java.util.List;

public interface AppRoleMapper extends BaseMapper<AppRole>{
    List<AppRole> selectRolesByUserId(String userId);
}

