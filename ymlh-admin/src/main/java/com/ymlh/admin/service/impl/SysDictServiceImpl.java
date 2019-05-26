/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.ymlh.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ymlh.admin.repository.SysDictRepository;
import com.ymlh.admin.service.SysDictService;
import com.ymlh.admin.utils.Query;
import com.ymlh.common.entity.SysDictEntity;
import com.ymlh.common.utils.PageUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysDictService")
public class SysDictServiceImpl extends ServiceImpl<SysDictRepository, SysDictEntity> implements SysDictService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String name = (String)params.get("name");
        IPage<SysDictEntity> page = this.page(
            new Query<SysDictEntity>().getPage(params),
            new QueryWrapper<SysDictEntity>()
                .like(StringUtils.isNotBlank(name),"name", name)
        );

        return new PageUtils(page);
    }

}
