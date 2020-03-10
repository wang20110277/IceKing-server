package iceking.base.controller.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import iceking.base.entity.SysUser;
import iceking.base.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /**
     * 获取所有用户
     * @return
     */
    @GetMapping("/getAllUsers")
    @ResponseBody
    public PageInfo<SysUser> getAllUsers(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        PageHelper.startPage(page,size);
        PageInfo<SysUser> users=new PageInfo<>(userService.getAllUsers());
        return users;
    }
}
