package iceking.base;

import iceking.base.controller.user.SysUserController;
import iceking.base.page.PageRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemTestApplication {

    @Autowired
    private SysUserController sysUserController;

    @Test
    public void findAllSysUsersTest(){
        PageRequest pageRequest=new PageRequest();
        pageRequest.setPageNum(1);
        pageRequest.setPageSize(10);
        sysUserController.findAllSysUsers(pageRequest);
    }
}
