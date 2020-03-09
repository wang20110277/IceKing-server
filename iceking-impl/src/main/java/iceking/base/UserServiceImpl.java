package iceking.base;

import iceking.base.entity.SysUser;
import iceking.base.mapper.SysUserMapper;
import iceking.base.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser getLoginUser(Integer id) {
        SysUser user=sysUserMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public String login(SysUser user) {
        return "success";
    }
}
