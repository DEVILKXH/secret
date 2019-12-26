package com.app.secret.services.impl;

import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.entity.AppTags;
import com.app.secret.mapper.AppTagsMapper;
import com.app.secret.services.AppTagsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppTagsServiceImpl extends BaseServiceImpl<AppTags, AppTagsMapper> implements AppTagsService {
    @Override
    public List<AppTags> getTagListByUserId(String userId) {
        return mapper.getTagListByUserId(userId);
    }
}

