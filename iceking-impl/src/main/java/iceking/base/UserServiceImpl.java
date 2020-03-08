package iceking.base;

import iceking.base.entity.User;
import iceking.base.service.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getLoginUser() {
        User user=new User();
        user.setUserId(1L);
        user.setUserName("zhangsan");
        user.setPassword("123456");
        return user;
    }
}
