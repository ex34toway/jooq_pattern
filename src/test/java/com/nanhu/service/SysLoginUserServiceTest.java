package com.nanhu.service;

import com.nanhu.model.sys.tables.pojos.SysLoginUser;
import com.nanhu.service.sys.SysLoginUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liliang on 2016/11/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SysLoginUserServiceTest {

    @Autowired
    private SysLoginUserService sysLoginUserService;

    @Test
    public void getSysLoginUserById()
    {
        SysLoginUser sysLoginUser =
                sysLoginUserService.getSysLoginUserById("81ee4dbae8474cd996fa288696545362");
        sysLoginUser.getId();
    }
}
