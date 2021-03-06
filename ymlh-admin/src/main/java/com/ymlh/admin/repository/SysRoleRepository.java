/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.ymlh.admin.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ymlh.common.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 角色管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@Repository
public interface SysRoleRepository extends BaseMapper<SysRoleEntity> {
	

}
