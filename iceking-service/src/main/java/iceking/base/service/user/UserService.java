package iceking.base.service.user;

import iceking.base.model.User;

public interface UserService {
    User getLoginUser();
    String login(User user);
}
