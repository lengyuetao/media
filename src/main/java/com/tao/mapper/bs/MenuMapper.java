package com.tao.mapper.bs;

import java.util.List;

import com.tao.entity.bs.MenuEntity;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {

    /**
     * 创建菜单
     * @param menu
     */
    void createMenu(MenuEntity menu);

    /**
     * 根据角色查找菜单
     * @param roleId
     * @return
     */
    List<MenuEntity> findMenuListByRoleId(int roleId);

    /**
     * 所有菜单
     * @return
     */
    List<MenuEntity> findAllMenuList(@Param("index") Integer index, @Param("rows") Integer rows);

    /**
     * 所有一级菜单
     * @return
     */
    List<MenuEntity> findAllTopMenuList();
    /**
     * 获取所有二级菜单
     * @return
     */
    List<MenuEntity> getAllSubsMenu();

    /**
     * 删除所有角色-菜单关系， 更新关系前先删除再添加
     * @param roleId
     */
    void delAllByRoleId(int roleId);

    /**
     * 添加关系
     * @param roleId
     * @param menuId
     */
    void addRoleMenu(@Param("roleId") int roleId, @Param("menuId") int menuId);
    /**
     * 修改菜单信息
     * @param menu
     * @return
     */
    int updateMenu(MenuEntity menu);
    /**
     * 统计
     * @return
     */
    int getMenuCount(@Param("title") String title);
    /**
     * 分页查询
     * @param title
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<MenuEntity> getMenuPageList(@Param("title") String title, @Param("pageIndex") Integer pageIndex, @Param("pageSize") Integer pageSize);
}
