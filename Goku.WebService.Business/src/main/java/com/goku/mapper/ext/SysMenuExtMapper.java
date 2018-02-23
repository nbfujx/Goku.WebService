package com.goku.mapper.ext;


import com.goku.mapper.SysMenuMapper;
import com.goku.model.SysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * Created by nbfujx on 2017/12/30.
 */
public interface SysMenuExtMapper extends SysMenuMapper {
    List<SysMenu> getModuleMenuForTree(String moduleId);
}
