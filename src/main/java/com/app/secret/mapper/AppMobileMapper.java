package com.app.secret.mapper;

import com.app.secret.entity.AppMobile;
import com.app.secret.core.base.mapper.BaseMapper;

import java.util.List;

public interface AppMobileMapper extends BaseMapper<AppMobile>{

    List<AppMobile> getMobileByUserIdAndTag(String userId);
}

