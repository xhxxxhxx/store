package com.cy.store.service;

import com.cy.store.entity.User;

/**用户模块业务层接口*/
public interface IUserService {

    /**
     * 用户名注册方法
     * @Param user 用户的数据对象
     * */
    void reg(User user);

}
