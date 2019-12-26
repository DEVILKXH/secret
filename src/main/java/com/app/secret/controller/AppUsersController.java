package com.app.secret.controller;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.core.util.UsersUtil;
import com.app.secret.core.vo.AjaxResult;
import com.app.secret.entity.AppUserTag;
import com.app.secret.entity.AppUsers;
import com.app.secret.entity.TokenUsers;
import com.app.secret.services.AppUsersService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/appUsers")
@Api(tags = "用户")
public class AppUsersController extends BaseController<AppUsers, AppUsersService> {

    @Autowired
    UsersUtil usersUtil;

    @RequestMapping(value = "/saveUserTag")
    @ResponseBody
    public AjaxResult<AppUsers> saveUserTag(@RequestBody List<AppUserTag> userTags) {
        TokenUsers users = usersUtil.getCurrentUser();
        return service.saveUserTag(userTags, users.getUuid());
    }

    @RequestMapping(value = "/getUserTagList")
    @ResponseBody
    public AjaxResult<AppUserTag> getUserTagList() {
        TokenUsers users = usersUtil.getCurrentUser();
        return service.getUserTagByUserId(users.getUuid());
    }
}
