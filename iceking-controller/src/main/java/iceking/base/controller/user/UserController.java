package iceking.base.controller.user;

import iceking.base.entity.SysUser;
import iceking.base.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 当前登录用户
     */
    @GetMapping("/getLoginUser")
    @ResponseBody
    public SysUser getLoginUser(@RequestParam(required = true) Integer id){
        return userService.getLoginUser(id);
    }

    /**
     * 登录验证
     */
    @PostMapping("/login")
    @ResponseBody
    public String login(SysUser user){
        return userService.login(user);
    }
}
