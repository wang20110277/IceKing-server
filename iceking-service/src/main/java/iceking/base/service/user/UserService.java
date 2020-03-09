package iceking.base.service.user;

import iceking.base.entity.User;

public interface UserService {
    User getLoginUser();
    String login(User user);
}
