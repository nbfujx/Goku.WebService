package com.goku.service;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/15.
 */
public interface loginService {
    boolean validUser( String username,  String password, String orgid);
}
