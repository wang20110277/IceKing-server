package iceking.base.service.user.impl;

import iceking.base.entity.SysUser;
import iceking.base.mapper.SysUserMapper;
import iceking.base.page.MybatisPageHelper;
import iceking.base.page.PageRequest;
import iceking.base.page.PageResult;
import iceking.base.service.impl.BaseServiceImpl;
import iceking.base.service.user.SysUserService;
import iceking.base.utils.ColumnFilterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserMapper getMapper() {
        return sysUserMapper;
    }

    @Override
    public SysUser findByName(String name) {
        return getMapper().findByName(name);
    }

    @Override
    public PageResult<SysUser> selectAll(PageRequest pageRequest) {
        PageResult pageResult = null;
        String name = ColumnFilterUtils.getColumnFilterValue(pageRequest, "name");
        String email = ColumnFilterUtils.getColumnFilterValue(pageRequest, "email");
        if(!StringUtils.isEmpty(name)) {
            if(!StringUtils.isEmpty(email)) {
                pageResult = MybatisPageHelper.findPage(pageRequest, getMapper(), "selectByNameAndEmail", name, email);
            } else {
                pageResult = MybatisPageHelper.findPage(pageRequest, getMapper(), "selectByName", name);
            }
        } else {
            pageResult = MybatisPageHelper.findPage(pageRequest, getMapper());
        }
        return pageResult;
    }
}
