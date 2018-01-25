package com.tao.entity.bs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MenuEntity implements Serializable{

	private static final long serialVersionUID = -4673650704196135317L;

	private Integer id;
	/**
	 * 菜单名称
	 */
	private String title;
	/**
	 * 资源路径
	 */
	private String url;
	/**
	 * 菜单一级，二级菜单
	 */
	private Byte level;
	/**
	 * 上一级菜单
	 */
	private Integer topLevel;
	/**
	 * 上级菜单标题
	 */
	private String topTitle;
	
	private List<MenuEntity> subs;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Byte getLevel() {
		return level;
	}
	public void setLevel(Byte level) {
		this.level = level;
	}
	
	public Integer getTopLevel() {
		return topLevel;
	}
	public void setTopLevel(Integer topLevel) {
		this.topLevel = topLevel;
	}
	public List<MenuEntity> getSubs() {
		return subs;
	}
	public void setSubs(List<MenuEntity> subs) {
		this.subs = subs;
	}
	public String getTopTitle() {
		return topTitle;
	}
	public void setTopTitle(String topTitle) {
		this.topTitle = topTitle;
	}
	public void addSub(MenuEntity menu){
	        if(this.subs == null){
	            this.subs = new ArrayList<>();
	            this.subs.add(menu);
	        }else{
	            this.subs.add(menu);
	        }
	}
	/**
	 * 重写equals方法
	 */
	public boolean equals(Object obj) {  
        if (obj instanceof MenuEntity) {      
        	MenuEntity u = (MenuEntity) obj;           
        	return this.title.equals(u.getTitle()) && this.id.equals(u.getId());        
        } 
        return super.equals(obj); 
	}
}
