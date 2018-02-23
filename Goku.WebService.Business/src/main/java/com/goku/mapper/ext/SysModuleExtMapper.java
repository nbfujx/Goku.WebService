package com.goku.mapper.ext;


import com.goku.mapper.SysModuleMapper;
import com.goku.model.SysModule;

import java.util.List;

/**
 * Created by nbfujx on 2017/12/30.
 */
public interface SysModuleExtMapper extends SysModuleMapper {
   List<SysModule> getModuleForPaging();
}
