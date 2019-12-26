package com.app.secret.controller;

import com.app.secret.core.base.controller.BaseController;
import com.app.secret.core.util.UsersUtil;
import com.app.secret.core.vo.AjaxResult;
import com.app.secret.entity.AppUserTag;
import com.app.secret.entity.AppUsers;
import com.app.secret.entity.TokenUsers;
import com.app.secret.services.AppUsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/appUsers")
@Api(tags = "用户")
public class AppUsersController extends BaseController<AppUsers, AppUsersService> {

    @Autowired
    UsersUtil usersUtil;

    @RequestMapping(value = "/selectOne.do",method={RequestMethod.POST})
    @ResponseBody
    @ApiOperation(value = "查询(单个)")
    @ApiImplicitParam(name = "token", value = "token", dataType = "String", paramType = "header", required = true)
    @Override
    public AppUsers selectOne(@RequestBody AppUsers record){
        List<AppUsers> records = service.select(record);
        if(null == records || records.size() == 0 ){
            return null;
        }
        return records.get(0);
    }

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
