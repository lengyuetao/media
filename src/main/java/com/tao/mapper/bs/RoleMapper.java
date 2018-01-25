package com.tao.mapper.bs;

import java.util.Date;
import java.util.List;

import com.tao.entity.bs.RoleEntity;
import org.apache.ibatis.annotations.Param;


public interface RoleMapper {
	/**
	 * 添加角色
	 * @param roleEntity
	 * @return
	 */
    int insert(RoleEntity roleEntity);
	/**
	 * 修改角色信息
	 * @param roleEntity
	 * @return
	 */
    int update(RoleEntity roleEntity);
	/**
	 * 查询角色信息
	 * @param name
	 * @return
	 */
    RoleEntity getRoleDetail(String name);
	/**
	 * 查询所有角色
	 * @return
	 */
    List<RoleEntity> getAllRole();
	/**
	 * 统计
	 * @param name
	 * @param startTm
	 * @param endTm
	 * @return
	 */
    int getRoleCount(@Param(value = "name") String name,
                     @Param(value = "startTm") Date startTm,
                     @Param(value = "endTm") Date endTm);
	/**
	 * 分页查询
	 * @param name
	 * @param startTm
	 * @param endTm
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
    List<RoleEntity> getRoleList(@Param(value = "name") String name,
                                 @Param(value = "startTm") Date startTm,
                                 @Param(value = "endTm") Date endTm,
                                 @Param(value = "pageIndex") Integer pageIndex,
                                 @Param(value = "pageSize") Integer pageSize);
}
