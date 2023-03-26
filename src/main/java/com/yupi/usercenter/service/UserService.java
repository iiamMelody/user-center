package com.yupi.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.usercenter.model.User;


import javax.servlet.http.HttpServletRequest;

/**
 * @author HahaZhen
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-02-02 16:27:21
 */

/**
 * 用户服务
 */
public interface UserService extends IService<User> {


    /**
     * 用户注册
     * @param userAccount
     * @param userPassword
     * @param checkPassword 确认密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword,String planetCode);


    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @return 返回用户脱敏信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     */
    int userLogout(HttpServletRequest request);
}
