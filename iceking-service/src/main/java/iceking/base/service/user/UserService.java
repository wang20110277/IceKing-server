package iceking.base.service.user;

import iceking.base.entity.SysUser;

public interface UserService {
    SysUser getLoginUser(Integer id);
    String login(SysUser user);
}
