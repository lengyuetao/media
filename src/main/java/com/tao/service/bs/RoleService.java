package com.tao.service.bs;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.tao.entity.bs.RoleEntity;
import com.tao.mapper.bs.RoleMapper;
import org.springframework.stereotype.Service;


@Service
public class RoleService {

	@Resource
	private RoleMapper roleMapper;
	
	/**
	 * 添加角色
	 * @param roleEntity
	 * @return
	 */
	public boolean insertRole(RoleEntity roleEntity){
		return roleMapper.insert(roleEntity)>0;
	}
	/**
	 * 修改角色信息
	 * @param roleEntity
	 * @return
	 */
	public boolean updateRole(RoleEntity roleEntity){
		return roleMapper.update(roleEntity)>0;
	}
	/**
	 * 查询角色信息
	 * @param name
	 * @return
	 */
	public RoleEntity getRoleDetail(String name){
		return roleMapper.getRoleDetail(name);
	}
	/**
	 * 查询所有角色
	 * @return
	 */
	public List<RoleEntity> getAllRole(){
		return roleMapper.getAllRole();
	}
	/**
	 * 查询统计
	 * @param name
	 * @param startTm
	 * @param endTm
	 * @return
	 */
	public int getRoleCount(String name,Date startTm,Date endTm){
		return roleMapper.getRoleCount(name, startTm, endTm);
	}
	/**
	 * 分页查询
	 * @param name
	 * @param startTm
	 * @param endTm
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public List<RoleEntity> getRolePageList(String name,
											Date startTm,
											Date endTm,
											Integer pageIndex,
											Integer pageSize){
		return roleMapper.getRoleList(name, startTm, endTm, (pageIndex-1)*pageSize, pageSize);
	}
}
