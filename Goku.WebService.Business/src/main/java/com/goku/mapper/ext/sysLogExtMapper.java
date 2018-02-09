package com.goku.mapper.ext;

import com.goku.mapper.sysLogMapper;
import com.goku.model.sysLog;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by nbfujx on 2018/1/16.
 */
public interface sysLogExtMapper extends sysLogMapper {
 List<sysLog> getLogForPaging(@Param("username") String username, @Param("begindate") Date begindate, @Param("enddate") Date enddate);
}
