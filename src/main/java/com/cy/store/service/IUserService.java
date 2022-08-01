package com.cy.store.service;

import com.cy.store.entity.User;

/**用户模块业务层接口*/
public interface IUserService {

    /**
     * 用户名注册方法
     * @Param user 用户的数据对象
     * */
    void reg(User user);

    /**
     * 用户登陆功能
     * @param username 用户名
     * @param password 密码
     * @return 当前匹配的用户数据，如果没有则返回null
     * */
    User login(String username, String password);

}
