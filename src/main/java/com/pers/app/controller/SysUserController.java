package com.pers.app.controller;

import com.pers.app.domain.SysUser;
import com.pers.app.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 用户控制层
 * @Date 2020-09-18
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    ISysUserService iSysUserService;

    /**
     * 测试
     * @return
     */
    @GetMapping("/insert")
    public String insertUser(){
        SysUser sysUser = new SysUser();
        sysUser.setUserCode("test1");
        sysUser.setPassWord("123456");
        sysUser.setUserName("测试1");
        sysUser.setUserType("0");
        String flag = String.valueOf(iSysUserService.insertUser(sysUser));
        return flag;
    }

    /**
     * 用户注册
     * @param request
     * @return
     */
    @PostMapping("/regist")
    public String userRegister(HttpServletRequest request){


        return null;
    }

    /**
     * 用户登录
     * @param request
     * @return
     */
    @PostMapping("/login")
    public String userLogin(HttpServletRequest request){
        String userCode = request.getParameter("userCode");
        String passWord = request.getParameter("passWord");
        SysUser sysUser = new SysUser();
        sysUser.setUserCode(userCode);
        sysUser.setPassWord(passWord);
        sysUser = iSysUserService.findSysUser(sysUser);
        if (sysUser == null) {
            return "1";
        }
        return "0";
    }
}
