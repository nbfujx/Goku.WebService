package com.goku.mapper.ext;


import com.goku.mapper.sysModuleMapper;
import com.goku.model.sysModule;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * Created by nbfujx on 2017/12/30.
 */
public interface sysModuleExtMapper extends sysModuleMapper {
   List<sysModule> getModuleForPaging();
}
