package iceking.base.controller.user;

import iceking.base.entity.User;
import iceking.base.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 测试登录
     */
    @GetMapping("/getLoginUser")
    @ResponseBody
    public User getLoginUser(){
        return userService.getLoginUser();
    }

    /**
     * 测试登录
     */
    @GetMapping("/login")
    @ResponseBody
    public String login(){
        return "success";
    }
}
