package com.app.secret.entity;import com.app.secret.core.base.entity.BaseEntity;public class AppMenu extends BaseEntity{			private java.lang.String menuName;   //菜单名称	private java.lang.String menuCode;   //菜单代码	private java.lang.String menuIcon;   //菜单图标	private java.lang.String parentMenuName;   //父菜单名称	private java.lang.String parentMenuCode;   //菜单编码	private java.lang.String menuPath;   //菜单路径	private java.lang.String menuEnable;   //是否可用	public java.lang.String getUuid() {	    return this.uuid;	}	public void setUuid(java.lang.String uuid) {	    this.uuid=uuid;	}	public java.lang.String getMenuName() {	    return this.menuName;	}	public void setMenuName(java.lang.String menuName) {	    this.menuName=menuName;	}	public java.lang.String getMenuCode() {	    return this.menuCode;	}	public void setMenuCode(java.lang.String menuCode) {	    this.menuCode=menuCode;	}	public java.lang.String getMenuIcon() {	    return this.menuIcon;	}	public void setMenuIcon(java.lang.String menuIcon) {	    this.menuIcon=menuIcon;	}	public java.lang.String getParentMenuName() {	    return this.parentMenuName;	}	public void setParentMenuName(java.lang.String parentMenuName) {	    this.parentMenuName=parentMenuName;	}	public java.lang.String getParentMenuCode() {	    return this.parentMenuCode;	}	public void setParentMenuCode(java.lang.String parentMenuCode) {	    this.parentMenuCode=parentMenuCode;	}	public java.lang.String getMenuPath() {	    return this.menuPath;	}	public void setMenuPath(java.lang.String menuPath) {	    this.menuPath=menuPath;	}	public java.lang.String getMenuEnable() {	    return this.menuEnable;	}	public void setMenuEnable(java.lang.String menuEnable) {	    this.menuEnable=menuEnable;	}}