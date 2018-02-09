package com.goku.common.util;

import com.github.pagehelper.PageInfo;
import com.goku.common.model.tablePage;
import org.springframework.stereotype.Component;

/**
 * Created by nbfujx on 2018/1/9.
 */
@Component
public class pageUtil {

     public tablePage getDataForPaging(PageInfo pageInfo)
     {
         tablePage tp=new tablePage();
         tp.setCode(0);
         tp.setMsg("");
         tp.setTotal(pageInfo.getTotal());
         tp.setRows(pageInfo.getList());
         return tp;
     }
}
