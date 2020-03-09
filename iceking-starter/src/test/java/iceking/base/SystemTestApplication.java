package iceking.base;

import iceking.base.controller.user.UserController;
import iceking.base.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemTestApplication {

    @Autowired
    private UserController userController;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    public void loginTest(){
        User user=new User();
        String result=userController.login(user);
        System.out.println(result);
    }
}
