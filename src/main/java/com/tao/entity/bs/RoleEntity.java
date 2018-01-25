package com.tao.entity.bs;

import java.io.Serializable;
import java.util.Date;

public class RoleEntity implements Serializable{

	private static final long serialVersionUID = -3689916641711871309L;
	
	private Integer id;
	/**
	 * 角色名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 创建时间
	 */
	private Date createTm;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateTm() {
		return createTm;
	}
	public void setCreateTm(Date createTm) {
		this.createTm = createTm;
	}
	
	
}
