package com.pers.app.service;

import com.pers.app.domain.SysUser;

/**
 * @Description 用户表业务层
 * @Date 2020-09-18
 */
public interface ISysUserService {

    SysUser findSysUser(SysUser sysUser);

    int insertUser(SysUser sysUser);
}
