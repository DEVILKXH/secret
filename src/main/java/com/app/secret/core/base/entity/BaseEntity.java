package com.app.secret.core.base.entity;

import javax.persistence.Id;

import com.app.secret.core.base.annotation.EnableExample;

public class BaseEntity {

	@EnableExample
	@Id
	protected String uuid;

	protected String docCreatorId;
	
	protected String docCreatorName;
	
	protected String docAlterorId;
	
	protected String docAlterorName;
	
	protected String docCreateTime;
	
	protected String docAlterorTime;

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

	public String getDocAlterorId() {
		return docAlterorId;
	}

	public void setDocAlterorId(String docAlterorId) {
		this.docAlterorId = docAlterorId;
	}

	public String getDocAlterorName() {
		return docAlterorName;
	}

	public void setDocAlterorName(String docAlterorName) {
		this.docAlterorName = docAlterorName;
	}

	public String getDocCreateTime() {
		return docCreateTime;
	}

	public void setDocCreateTime(String docCreateTime) {
		this.docCreateTime = docCreateTime;
	}

	public String getDocAlterorTime() {
		return docAlterorTime;
	}

	public void setDocAlterorTime(String docAlterorTime) {
		this.docAlterorTime = docAlterorTime;
	}
	
}
