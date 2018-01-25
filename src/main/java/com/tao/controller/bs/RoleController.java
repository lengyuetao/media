package com.tao.controller.bs;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.tao.common.CommonConstant;
import com.tao.common.MessageCode;
import com.tao.common.WebResult;
import com.tao.entity.bs.RoleEntity;
import com.tao.service.bs.RoleService;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/role")
public class RoleController {
	

	@Resource
	private RoleService roleService;
	
	/**
	 * 添加角色
	 * @param name
	 * @param description
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public WebResult addRole(@RequestParam(value="name")String name,
							 @RequestParam(value="description")String description){
		
		RoleEntity role=new RoleEntity();
		role.setName(name);
		role.setDescription(description);
		
		try{
			if(roleService.insertRole(role)){
				return new WebResult(MessageCode.SUCCESS);
			}
			return new WebResult(MessageCode.FAIL);
		}catch(DuplicateKeyException e){
			return new WebResult(MessageCode.ROLE_EXISTS);
		}
	}
	/**
	 * 修改角色信息
	 * @param id
	 * @param name
	 * @param description
	 * @return
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public WebResult updateRole(@RequestParam(value="id")Integer id,
								@RequestParam(value="name",required=false)String name,
								@RequestParam(value="description",required=false)String description){
		RoleEntity role=new RoleEntity();
		role.setId(id);
		role.setName(name);
		role.setDescription(description);
		try{
			if(roleService.updateRole(role)){
				return new WebResult(MessageCode.SUCCESS);
			}
			return new WebResult(MessageCode.FAIL);
		}catch(DuplicateKeyException e){
			return new WebResult(MessageCode.ROLE_EXISTS);
		}
	}
	/**
	 * 所有角色
	 * @return
	 */
	@RequestMapping(value="/all/list",method=RequestMethod.GET)
	public WebResult getAllRoleList(){
		List<RoleEntity> list=roleService.getAllRole();
		return new WebResult(MessageCode.SUCCESS).put(CommonConstant.RES_DATA,list);
	}
	/**
	 * 分页查询
	 * @param name
	 * @param startTm
	 * @param endTm
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public WebResult getRoleList(@RequestParam(value="name",required=false)String name,
								@RequestParam(value="startTm",required=false)Long startTm,
								@RequestParam(value="endTm",required=false)Long endTm,
								@RequestParam(value="page",defaultValue="1")Integer page,
								@RequestParam(value="rows",defaultValue="20")Integer rows){
		Date st=null,et=null;
		if(null!=startTm){
		st = new Date(startTm);
		}
		if(null!=endTm){
		et=new Date(endTm);
		}
		
		int total=roleService.getRoleCount(name, st, et);
		List<RoleEntity> list=roleService.getRolePageList(name, st, et, page, rows);
		WebResult res=new WebResult(MessageCode.SUCCESS);
  		res.put(CommonConstant.RES_DATA,list);
  		res.put(CommonConstant.RES_TOTAL, total);
  		return res;
	}
}
