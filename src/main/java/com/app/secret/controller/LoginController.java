package com.app.secret.controller;

import com.app.secret.core.BaseExceptionEnum;
import com.app.secret.core.base.annotation.IgnoreAccessToken;
import com.app.secret.core.util.AjaxResultUtil;
import com.app.secret.core.util.StringUtil;
import com.app.secret.core.vo.AjaxResult;
import com.app.secret.core.vo.UserInfo;
import com.app.secret.entity.TokenUsers;
import com.app.secret.services.AppUsersService;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/index")
@Api(tags = "登录")
@IgnoreAccessToken
public class LoginController {

    @Autowired
    private AppUsersService usersService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "success";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AjaxResult<TokenUsers> login(@RequestBody UserInfo userInfo, HttpServletResponse response) {
        String userCode = userInfo.getUserCode();
        String password = userInfo.getPassword();

        if(StringUtil.isNull(userCode)) {
            return AjaxResult.fail(BaseExceptionEnum.USER_CODE_CAN_NOT_BE_NULL);
        }
        if(StringUtil.isNull(password)) {
            return AjaxResult.fail(BaseExceptionEnum.USER_PSWD_CAN_NOT_BE_NULL);
        }
        TokenUsers users = usersService.loadUserByUserCode(userCode, password);
        if(null == users) {
            return AjaxResult.fail(BaseExceptionEnum.USER_CODE_NOT_FOUND);
        }

        Cookie cookie = new Cookie("token", users.getToken());
        response.addCookie(cookie);
        cookie.setPath("/");
        return AjaxResult.success(users);
    }
}
