package com.app.secret.core.base.entity;

import javax.persistence.Id;

import com.app.secret.core.base.annotation.EnableExample;

public class BaseEntity {

	@EnableExample
	@Id
	protected String uuid;

	protected String docCreatorId;
	
	protected String docCreatorName;
	
	protected String docAlterId;
	
	protected String docAlterName;
	
	protected String docCreateTime;
	
	protected String docAlterTime;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getDocCreatorId() {
		return docCreatorId;
	}

	public void setDocCreatorId(String docCreatorId) {
		this.docCreatorId = docCreatorId;
	}

	public String getDocCreatorName() {
		return docCreatorName;
	}

	public void setDocCreatorName(String docCreatorName) {
		this.docCreatorName = docCreatorName;
	}

	public String getDocAlterId() {
		return docAlterId;
	}

	public void setDocAlterId(String docAlterId) {
		this.docAlterId = docAlterId;
	}

	public String getDocAlterName() {
		return docAlterName;
	}

	public void setDocAlterName(String docAlterName) {
		this.docAlterName = docAlterName;
	}

	public String getDocCreateTime() {
		return docCreateTime;
	}

	public void setDocCreateTime(String docCreateTime) {
		this.docCreateTime = docCreateTime;
	}

	public String getDocAlterTime() {
		return docAlterTime;
	}

	public void setDocAlterTime(String docAlterTime) {
		this.docAlterTime = docAlterTime;
	}
	
}
