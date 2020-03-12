package iceking.base.service.user.impl;

import iceking.base.entity.SysUser;
import iceking.base.mapper.BaseMapper;
import iceking.base.mapper.SysUserMapper;
import iceking.base.service.impl.BaseServiceImpl;
import iceking.base.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<SysUser> implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public BaseMapper<SysUser> getMapper() {
        return sysUserMapper;
    }
}
