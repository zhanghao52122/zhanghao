/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.ymlh.admin.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ymlh.common.entity.TokenEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Token
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface TokenRepository extends BaseMapper<TokenEntity> {
	
}
