package com.goku.mapper.ext;

import com.goku.mapper.SysUserMapper;
import com.goku.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface SysUserExtMapper extends SysUserMapper {
    SysUser selectByUsername(String username);
    List<SysUser> selectUserByOrgid(@Param("orgid") String orgid, @Param("orderSort") String orderSort, @Param("orderFiled") String orderFiled);

}
