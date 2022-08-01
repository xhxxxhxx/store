package com.cy.store.controller;

import com.cy.store.service.ex.InsertException;
import com.cy.store.service.ex.ServiceException;
import com.cy.store.service.ex.UsernameDuplicateException;
import com.cy.store.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*控制层类的基类*/
public class BaseController {
    /*表示操作成功的状态码*/
    public static final int OK = 200;
    /*操作不成功*/

    //请求处理方法，这个方法的返回值就是需要传递给前端的数据
    @ExceptionHandler(ServiceException.class) //用于统一处理抛出的异常
    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> result = new JsonResult<>(e);
        if (e instanceof UsernameDuplicateException) {
            result.setState(4000);
            result.setMessage("");
        } else if (e instanceof InsertException) {
            result.setState(4000);
            result.setMessage("");
        }
        return result;
    }
}
