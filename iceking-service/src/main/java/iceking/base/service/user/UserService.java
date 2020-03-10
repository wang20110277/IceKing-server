package iceking.base.service.user;

import com.github.pagehelper.Page;
import iceking.base.entity.SysUser;

public interface UserService {
    SysUser getLoginUser(Integer id);
    String login(SysUser user);
    Page<SysUser> getAllUsers();
}
