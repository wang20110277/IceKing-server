package iceking.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    /**
     * 测试登录
     */
    @RequestMapping("/getLoginUser")
    @ResponseBody
    public String getLoginUser(){
        return "success";
    }
}
