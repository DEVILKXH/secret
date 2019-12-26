package com.app.secret.mapper;

import com.app.secret.entity.AppTags;
import com.app.secret.core.base.mapper.BaseMapper;

import java.util.List;

public interface AppTagsMapper extends BaseMapper<AppTags>{

    List<AppTags> getTagListByUserId(String userId);
}

