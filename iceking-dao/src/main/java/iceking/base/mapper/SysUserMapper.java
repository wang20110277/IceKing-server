package iceking.base.mapper;

import iceking.base.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper extends BaseMapper<SysUser>{
    List<SysUser> selectAll();
}