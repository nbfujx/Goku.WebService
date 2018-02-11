package com.goku.mapper.ext;

import com.goku.mapper.sysUserMapper;
import com.goku.model.sysUser;
import org.apache.ibatis.annotations.Param;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserExtMapper extends sysUserMapper {
    sysUser selectByUsername(String username);
    List<sysUser> selectUserByOrgid(@Param("orgid") String orgid,@Param("orderSort") String orderSort,@Param("orderFiled") String orderFiled);

}
