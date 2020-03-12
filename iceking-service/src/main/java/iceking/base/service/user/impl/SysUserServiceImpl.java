package iceking.base.service.user.impl;

import iceking.base.entity.SysUser;
import iceking.base.mapper.BaseMapper;
import iceking.base.mapper.SysUserMapper;
import iceking.base.page.MybatisPageHelper;
import iceking.base.page.PageRequest;
import iceking.base.page.PageResult;
import iceking.base.service.impl.BaseServiceImpl;
import iceking.base.service.user.SysUserService;
import iceking.base.utils.ColumnFilterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public BaseMapper<SysUser> getMapper() {
        return sysUserMapper;
    }

    @Override
    public PageResult<SysUser> selectAll(PageRequest pageRequest) {
        PageResult pageResult = null;
        String name = ColumnFilterUtils.getColumnFilterValue(pageRequest, "name");
        String email = ColumnFilterUtils.getColumnFilterValue(pageRequest, "email");
        if(name != null) {
            if(email != null) {
                pageResult = MybatisPageHelper.findPage(pageRequest, getMapper(), "findPageByNameAndEmail", name, email);
            } else {
                pageResult = MybatisPageHelper.findPage(pageRequest, getMapper(), "findPageByName", name);
            }
        } else {
            pageResult = MybatisPageHelper.findPage(pageRequest, getMapper());
        }
        // 加载用户角色信息
        return pageResult;
    }
}
