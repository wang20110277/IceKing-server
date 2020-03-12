package iceking.base.controller.user;

import iceking.base.http.HttpResult;
import iceking.base.page.PageRequest;
import iceking.base.service.user.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/* 类注解 */
@Api(value = "/user")
@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    /* 方法注解 */
    @ApiOperation(value = "/findByName", notes = "")
    @GetMapping(value="/findByName")
    public HttpResult findByUserName(/* 参数注解 */ @ApiParam(value = "name" , required=true )@RequestParam String name) {
        return HttpResult.ok(sysUserService.findByName(name));
    }

    @PostMapping("/findAllSysUsers")
    public HttpResult findAllSysUsers(@RequestBody PageRequest pageRequest){
        return HttpResult.ok(sysUserService.selectAll(pageRequest));
    }
}
