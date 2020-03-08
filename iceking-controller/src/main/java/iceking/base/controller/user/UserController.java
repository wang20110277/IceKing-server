package iceking.base.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 测试登录
     */
    @GetMapping("/getLoginUser")
    @ResponseBody
    public String getLoginUser(){
        return "success";
    }
}
