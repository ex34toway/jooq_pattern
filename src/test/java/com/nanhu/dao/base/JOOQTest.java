package com.nanhu.dao.base;

import static com.nanhu.model.sys.tables.SysLoginUser.SYS_LOGIN_USER;
import static org.junit.Assert.*;

import com.nanhu.model.DTO.sys.SysLoginUserVo;
import com.nanhu.model.sys.DefaultCatalog;
import com.nanhu.model.sys.tables.SysMember;
import com.nanhu.model.sys.tables.daos.SysLoginUserDao;
import com.nanhu.model.sys.tables.pojos.SysLoginUser;
import org.dozer.Mapper;
import org.jooq.DSLContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lilang on 2016/10/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
@Transactional
public class JOOQTest {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private Mapper dozerBeanMapper;

    @Autowired
    private SysLoginUserDao sysLoginUserDao;

    @Test
    public void selectOneField()
    {
        SysLoginUser sysLoginUser =
                dslContext.selectFrom(SYS_LOGIN_USER)
                        .where(SYS_LOGIN_USER.ID.equal("81ee4dbae8474cd996fa288696545362"))
                        .fetchOne().into(SysLoginUser.class);
        sysLoginUser.getId();
        assertNotNull(sysLoginUser);
    }

    @Test
    @Rollback(false)
    public void update()
    {
        dslContext.update(SYS_LOGIN_USER).set(SYS_LOGIN_USER.USERNAME, "liliang")
                .where(SYS_LOGIN_USER.ID.equal("81ee4dbae8474cd996fa288696545362")).execute();

        /*SysLoginUser sysLoginUser =
                dslContext.selectFrom(SYS_LOGIN_USER)
                        .where(SYS_LOGIN_USER.ID.equal("81ee4dbae8474cd996fa288696545362"))
                        .fetchOne().into(SysLoginUser.class);
        assertThat(sysLoginUser.getUsername(), equalTo("admin"));
        */
    }

    @Test
    public void testBase()
    {
        SysLoginUser sysLoginUser =
                sysLoginUserDao.fetchOneById("81ee4dbae8474cd996fa288696545362");
        sysLoginUser.getId();
    }

    @Test
    public void leftJoin()
    {
        com.nanhu.model.sys.tables.SysLoginUser user =
                DefaultCatalog.DEFAULT_CATALOG.SPRING_BOOT.SYS_LOGIN_USER.as("user");
        SysMember member =
                DefaultCatalog.DEFAULT_CATALOG.SPRING_BOOT.SYS_MEMBER.as("member");
        List<SysLoginUserVo> record =
                dslContext.select(user.USERNAME,user.LOGINNAME,user.EMAIL,user.MOBILE).from(user)
                .leftJoin(member)
                .on(member.USERID.equal(user.ID)).and(member.USERID.isNotNull())
                .where(user.ID.eq("81ee4dbae8474cd996fa288696545362")).fetch().into(SysLoginUserVo.class);
        record.get(0);
    }
}
