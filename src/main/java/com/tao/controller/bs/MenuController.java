package com.tao.controller.bs;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tao.common.CommonConstant;
import com.tao.common.MessageCode;
import com.tao.common.WebResult;
import com.tao.entity.bs.MenuEntity;
import com.tao.service.bs.MenuService;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Resource
	private MenuService menuService;
	/**
	 * 添加菜单
	 * @param request
	 * @param response
	 * @param title
	 * @param url
	 * @param level
	 * @param topLevel
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public WebResult insert(HttpServletRequest request, HttpServletResponse response,
							@RequestParam(value="title")String title,
							@RequestParam(value="url",required=false)String url,
							@RequestParam(value="level")Byte level,
							@RequestParam(value="topLevel")Integer topLevel){
		MenuEntity menu=new MenuEntity();
		menu.setTitle(title);
		menu.setUrl(url);
		if(null!=level){
			menu.setLevel(level);
		}
		if(null!=topLevel){
			menu.setTopLevel(topLevel);
		}
		try{
			if(menuService.createMenu(menu)){
				return new WebResult(MessageCode.SUCCESS);
			}
			return new WebResult(MessageCode.FAIL);
		}catch(DuplicateKeyException e){
			return new WebResult(MessageCode.MENU_TITLE_EXSITS);
		}
	}
	
	
	/**
	 * 所有一级菜单
	 * @return
	 */
	@RequestMapping(value="/toplist",method=RequestMethod.GET)
	public WebResult getTopMenuList(){
		List<MenuEntity> list=menuService.getTopMenList();
		return new WebResult(MessageCode.SUCCESS).put(CommonConstant.RES_DATA,list);
	}
	/**
	 * 设置角色权限
	 * @param request
	 * @param response
	 * @param menuId
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="/role/permition",method=RequestMethod.POST)
	public WebResult update(HttpServletRequest request,HttpServletResponse response,
							@RequestParam(value="menuId")String menuId,
							@RequestParam(value="roleId")Integer roleId){
		JSONArray json=JSONArray.parseArray(menuId);
		List<Integer> lst=new ArrayList<>();
		for(int i=0;i<json.size();i++){
			lst.add(json.getInteger(i));
		}
		if(menuService.updateRoleMenu(roleId, lst)){
			return new WebResult(MessageCode.SUCCESS);
		}
		return new WebResult(MessageCode.FAIL);
		
	}	
	
	/**
	 * 获取所有子菜单
	 * @return
	 */
	@RequestMapping(value="/subs/list",method=RequestMethod.GET)
	public WebResult getMenuList(){
		List<MenuEntity> list=menuService.getAllSubsMenu();
		return new WebResult(MessageCode.SUCCESS).put(CommonConstant.RES_DATA,list);
	} 
	/**
	 * 查询角色权限列表
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="/role/permition/list",method=RequestMethod.GET)
	public WebResult getPermitionMenuList(@RequestParam(value="roleId")Integer roleId){
		List<MenuEntity> list= menuService.getRolePermtionListByRoleId(roleId);
		return new WebResult(MessageCode.SUCCESS).put(CommonConstant.RES_DATA,list);
	} 
	
	
	/**
	 * 修改菜单信息
	 * @return
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public WebResult updateMenu(@RequestParam(value="id")Integer id,
								@RequestParam(value="title",required=false)String title,
								@RequestParam(value="url",required=false)String url,
								@RequestParam(value="level",required=false)Byte level,
								@RequestParam(value="topLevel",required=false)Integer topLevel){
		MenuEntity menu=new MenuEntity();
		menu.setId(id);
		menu.setTitle(title);
		menu.setUrl(url);
		if(null!=level){
			menu.setLevel(level);
		}
		if(null!=topLevel){
			menu.setTopLevel(topLevel);
		}
		try{
			if(menuService.updateMenu(menu)){
				return new WebResult(MessageCode.SUCCESS);
			}
			return new WebResult(MessageCode.FAIL);
			
		}catch(DuplicateKeyException e){
			return new WebResult(MessageCode.MENU_TITLE_EXSITS);
		}
	}
	/**
	 * 分页列表
	 * @param title
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(value="/pagelist",method=RequestMethod.GET)
	public WebResult getMenuAllList(@RequestParam(value="title",required=false)String title,
									@RequestParam(value="page",defaultValue="1")Integer page,
									@RequestParam(value="rows",defaultValue="20")Integer rows){
		List<MenuEntity> list=menuService.getMenuPageList(title, (page-1)*rows,rows);
		int total=menuService.getMenuCount(title);
		WebResult res=new WebResult(MessageCode.SUCCESS);
		res.put(CommonConstant.RES_DATA, list);
		res.put(CommonConstant.RES_TOTAL, total);
		return res;
	} 
}
