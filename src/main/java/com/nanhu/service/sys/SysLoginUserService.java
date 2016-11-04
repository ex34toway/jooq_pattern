package com.nanhu.service.sys;

import static com.nanhu.model.sys.tables.SysLoginUser.SYS_LOGIN_USER;

import com.nanhu.model.sys.tables.daos.SysLoginUserDao;
import com.nanhu.model.sys.tables.pojos.SysLoginUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liliang on 2016/11/5.
 */
@Service
public class SysLoginUserService {

    @Autowired
    private SysLoginUserDao sysLoginUserDao;

    /**
     * 根据用户Id查找用户
     * @param userId
     * @return
     */
    public SysLoginUser getSysLoginUserById(String userId)
    {
        SysLoginUser sysLoginUser = new SysLoginUser();
        if(StringUtils.isNotBlank(userId)){
            sysLoginUser = sysLoginUserDao.fetchOneById(userId);
            sysLoginUser.setPassword(null);
            sysLoginUser.setSalt(null);
        }
        return sysLoginUser;
    }
}
