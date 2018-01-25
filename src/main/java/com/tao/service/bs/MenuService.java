package com.tao.service.bs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import com.tao.entity.bs.MenuEntity;
import com.tao.mapper.bs.MenuMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;



/**
 * @author cloud cloud
 * @create 2017/11/2
 **/
@Service
public class MenuService {
    @Resource
    private MenuMapper menuMapper;

    public boolean createMenu(MenuEntity menu){
        menuMapper.createMenu(menu);
        return true;
    }

    /**
     * 菜单查找
     * @param roleId
     * @return
     */
    public List<MenuEntity> getMenusByUserId(int roleId){
        List<MenuEntity> topMenus = menuMapper.findAllTopMenuList();
        List<MenuEntity> list = menuMapper.findMenuListByRoleId(roleId);
        return sortList(topMenus, list);
    }
    /**
     * 查询角色权限
     * @param roleId
     * @return
     */
    public List<MenuEntity> getRolePermtionListByRoleId(Integer roleId){
    	return menuMapper.findMenuListByRoleId(roleId);
    }
    
	private List<MenuEntity> sortList(List<MenuEntity> topMenus, List<MenuEntity> list) {
		List<MenuEntity> resList = new ArrayList<>();
		for(MenuEntity menu : list){
            //是一级菜单
            if(isTopMenu(menu)){
                //没有则添加
                if(!resList.contains(menu)){
                    resList.add(menu);
                }
            }else{
                //是二级菜单
                //找到上级菜单
                MenuEntity topMenu = getMenuById(menu.getTopLevel(),topMenus);
                if(topMenu == null){
                    continue;
                }
                if(resList.contains(topMenu)){
                    //结果集里否存在这个上级菜单
                    int index = resList.indexOf(topMenu);
                    resList.get(index).addSub(menu);
                }else{
                    //结果集里没有这个上级菜单
                    topMenu.addSub(menu);
                    resList.add(topMenu);
                }
            }
        }
        if(resList != null){
            Collections.sort(resList, new Comparator<MenuEntity>() {
                @Override
                public int compare(MenuEntity o1, MenuEntity o2) {
                    if(o1.getId()>o2.getId()){
                        return 1;
                    }else if(o1.getId() == o2.getId()){
                        return 0;
                    }else{
                        return -1;
                    }
                }
            });
        }
        return resList;
	}

    /**
     * 先删除再更新
     * @param roleId
     * @param menusIds
     * @return
     */
    public boolean updateRoleMenu(int roleId,List<Integer> menusIds){
        menuMapper.delAllByRoleId(roleId);
        for(Integer menuId:menusIds){
            menuMapper.addRoleMenu(roleId,menuId);
        }
        return true;
    }


    private MenuEntity getMenuById(int id,List<MenuEntity>list){
        for(MenuEntity menu : list){
            if(id == menu.getId()){
                return menu;
            }
        }
        return null;
    }

    private boolean isTopMenu(MenuEntity menuEntity){
        return StringUtils.isEmpty(menuEntity.getUrl()) || menuEntity.getLevel() == 1;
    }
    
    public List<MenuEntity> getTopMenList(){
    	return menuMapper.findAllTopMenuList();
    }
    
    public List<MenuEntity> getMenuList(){
    	List<MenuEntity> topMenus = menuMapper.findAllTopMenuList();
   	 	List<MenuEntity> list =menuMapper.findAllMenuList(null,null);
        return sortList(topMenus, list);
    }
    /**
     * 修改菜单
     * @param menu
     * @return
     */
    public boolean updateMenu(MenuEntity menu){
    	return menuMapper.updateMenu(menu)>0;
    }
    /**
     * 查询统计
     * @param title
     * @return
     */
    public int getMenuCount(String title){
    	return menuMapper.getMenuCount(title);
    }
    /**
     * 分页查询
     * @param title
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public List<MenuEntity> getMenuPageList(String title,Integer pageIndex,Integer pageSize){
    	return menuMapper.getMenuPageList(title, pageIndex, pageSize);
    }
    
    public List<MenuEntity> getAllSubsMenu(){
    	List<MenuEntity> list=menuMapper.getAllSubsMenu();
    	List<MenuEntity> topMenu=new ArrayList<>();
    	List<MenuEntity> subMenu=new ArrayList<>();
    	
    	List<MenuEntity> res=new ArrayList<>();
    	
    	//一级，二级目录遍历存储
    	for(MenuEntity u:list){
    		if(StringUtils.isEmpty(u.getUrl()) && u.getLevel()==1){
    			topMenu.add(u);
    		}else{
    			subMenu.add(u);
    		}
    	}
    	//对二级目录分类存储
    	for(MenuEntity top:topMenu){
    		for(MenuEntity s:subMenu){
    			if(top.getId()==s.getTopLevel()){
    				top.addSub(s);
    			}
    		}
    		res.add(top);
    	}
    	
    	
    	if(res != null){
            Collections.sort(res, new Comparator<MenuEntity>() {
                @Override
                public int compare(MenuEntity o1, MenuEntity o2) {
                    if(o1.getId()>o2.getId()){
                        return 1;
                    }else if(o1.getId() == o2.getId()){
                        return 0;
                    }else{
                        return -1;
                    }
                }
            });
        }
    	return res;
    }
}
