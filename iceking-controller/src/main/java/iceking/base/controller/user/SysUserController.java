package iceking.base.controller.user;

import iceking.base.http.HttpResult;
import iceking.base.page.PageRequest;
import iceking.base.service.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/findAllSysUsers")
    public HttpResult findAllSysUsers(@RequestBody PageRequest pageRequest){
        return HttpResult.ok(sysUserService.selectAll(pageRequest));
    }
}
