package com.app.secret.services;


import com.app.secret.core.base.service.BaseService;
import com.app.secret.entity.AppTags;

import java.util.List;

public interface AppTagsService extends BaseService<AppTags>{

    List<AppTags> getTagListByUserId(String userId);
}

