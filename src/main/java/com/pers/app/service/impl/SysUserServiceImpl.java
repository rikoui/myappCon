package com.pers.app.service.impl;

import com.pers.app.domain.SysUser;
import com.pers.app.mapper.SysUserMapper;
import com.pers.app.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 用户表业务层处理
 * @Date 2020-09-18
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser findSysUser(SysUser sysUser) {
        return sysUserMapper.findSysUser(sysUser);
    }

    @Override
    public int insertUser(SysUser sysUser) {
        return sysUserMapper.insertUser(sysUser);
    }
}
