package com.app.secret.services.impl;

import com.app.secret.core.util.UsersUtil;
import com.app.secret.core.vo.AjaxResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.secret.core.base.serviceimpl.BaseServiceImpl;
import com.app.secret.entity.AppMobile;
import com.app.secret.mapper.AppMobileMapper;
import com.app.secret.services.AppMobileService;

import java.util.List;

@Service
public class AppMobileServiceImpl extends BaseServiceImpl<AppMobile, AppMobileMapper> implements AppMobileService {

    @Autowired
    UsersUtil usersUtil;

    @Override
    public PageInfo<AppMobile> getQueryByPage(AppMobile entity, PageInfo<AppMobile> page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<AppMobile> list = mapper.getMobileByUserIdAndTag(usersUtil.getCurrentUser().getUuid());
        PageInfo<AppMobile> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}

