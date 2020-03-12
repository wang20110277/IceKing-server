package iceking.base.mapper;

import iceking.base.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper extends BaseMapper<SysUser>{
    SysUser findByName(@Param(value="name") String name);
    List<SysUser> selectAll();
    List<SysUser> selectByName(@Param(value="name") String name);
    List<SysUser> selectByNameAndEmail(@Param(value="name") String name, @Param(value="email") String email);
}