package com.cy.store.controller;

import com.cy.store.entity.User;
import com.cy.store.service.IUserService;
import com.cy.store.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController{

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/reg")
    @ResponseBody
    public JsonResult<Void> reg(User user) {

        iUserService.reg(user);
        return new JsonResult<Void>(OK);
    }

    @RequestMapping("login")
    @ResponseBody
    public JsonResult<User> login(String username, String password){

        User data = iUserService.login(username,password);
        //想session对象中完成数据的绑定(session全局的)
        return new JsonResult<User>(OK,data);
    }
}
