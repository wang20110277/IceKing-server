package iceking.base.service.user;

import iceking.base.entity.SysUser;
import iceking.base.page.PageRequest;
import iceking.base.page.PageResult;
import iceking.base.service.BaseService;

public interface SysUserService extends BaseService<SysUser> {
    PageResult<SysUser> selectAll(PageRequest pageRequest);
}
