package iceking.base.controller.open;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/open")
public class SystemController {
    @GetMapping("/home")
    public String getHome(){
        return "欢迎登录首页！";
    }
    @GetMapping("/logout")
    public String getLogout(){
        return "系统未登录，请先登录系统！";
    }
}
