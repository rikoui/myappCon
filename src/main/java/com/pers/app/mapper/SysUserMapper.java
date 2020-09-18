package com.pers.app.mapper;

import com.pers.app.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Description 用户表数据层
 * @Date 2020-09-18
 */
@Mapper
@Component
public interface SysUserMapper {

    SysUser findSysUser(SysUser sysUser);

    int insertUser(SysUser sysUser);
}
