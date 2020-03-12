package iceking.base.controller.user;

import iceking.base.http.HttpResult;
import iceking.base.page.PageRequest;
import iceking.base.service.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;


    @GetMapping(value="/findByName")
    public HttpResult findByUserName(@RequestParam String name) {
        return HttpResult.ok(sysUserService.findByName(name));
    }

    @PostMapping("/findAllSysUsers")
    public HttpResult findAllSysUsers(@RequestBody PageRequest pageRequest){
        return HttpResult.ok(sysUserService.selectAll(pageRequest));
    }
}
