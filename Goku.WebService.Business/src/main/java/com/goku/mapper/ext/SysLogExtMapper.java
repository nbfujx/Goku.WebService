package com.goku.mapper.ext;

import com.goku.mapper.SysLogMapper;
import com.goku.model.SysLog;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by nbfujx on 2018/1/16.
 */
public interface SysLogExtMapper extends SysLogMapper {
 List<SysLog> getLogForPaging(@Param("username") String username, @Param("begindate") Date begindate, @Param("enddate") Date enddate);
}
