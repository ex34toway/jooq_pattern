package com.nanhu.api.sys;

import com.nanhu.model.sys.tables.pojos.SysLoginUser;
import com.nanhu.service.sys.SysLoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liliang on 2016/10/31.
 */
@RestController
@RequestMapping("/api/sys/user")
public class SysLoginUserController {

    @Autowired
    private SysLoginUserService sysLoginUserService;

    @RequestMapping("/{id}")
    @ResponseBody
    public SysLoginUser getSysLoginUserById(@PathVariable("id")String userId)
    {
        return sysLoginUserService.getSysLoginUserById(userId);
    }
}
