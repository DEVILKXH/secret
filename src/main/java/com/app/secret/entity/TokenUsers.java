package com.app.secret.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Table;

/**
 * @author kexiaohong
 */
@ApiModel(value = "当前用户")
public class TokenUsers{

    @ApiModelProperty(value = "uuid")
    private String uuid;

    @ApiModelProperty(value = "名称")
    private String username;

    @ApiModelProperty(value = "accessToken")
    private String token;

    @ApiModelProperty(value = "部门")
    private AppDept dept;

    public TokenUsers(){

    }

    public TokenUsers(String uuid, String username, String token) {
        this.uuid = uuid;
        this.username = username;
        this.token = token;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AppDept getDept() {
        return dept;
    }

    public void setDept(AppDept dept) {
        this.dept = dept;
    }
}
