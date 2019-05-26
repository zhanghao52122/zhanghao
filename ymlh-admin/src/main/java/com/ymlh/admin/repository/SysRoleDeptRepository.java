/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.ymlh.admin.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ymlh.common.entity.SysRoleDeptEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色与部门对应关系
 *
 * @author Mark sunlightcs@gmail.com
 */
@Repository
public interface SysRoleDeptRepository extends BaseMapper<SysRoleDeptEntity> {
	
	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long[] roleIds);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
