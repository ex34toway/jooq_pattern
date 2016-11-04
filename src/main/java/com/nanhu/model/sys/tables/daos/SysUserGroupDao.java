/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.daos;


import com.nanhu.model.sys.tables.SysUserGroup;
import com.nanhu.model.sys.tables.records.SysUserGroupRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 用户与用户组关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class SysUserGroupDao extends DAOImpl<SysUserGroupRecord, com.nanhu.model.sys.tables.pojos.SysUserGroup, Record2<String, String>> {

    /**
     * Create a new SysUserGroupDao without any configuration
     */
    public SysUserGroupDao() {
        super(SysUserGroup.SYS_USER_GROUP, com.nanhu.model.sys.tables.pojos.SysUserGroup.class);
    }

    /**
     * Create a new SysUserGroupDao with an attached configuration
     */
    @Autowired
    public SysUserGroupDao(Configuration configuration) {
        super(SysUserGroup.SYS_USER_GROUP, com.nanhu.model.sys.tables.pojos.SysUserGroup.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(com.nanhu.model.sys.tables.pojos.SysUserGroup object) {
        return compositeKeyRecord(object.getUserid(), object.getGroupid());
    }

    /**
     * Fetch records that have <code>userId IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysUserGroup> fetchByUserid(String... values) {
        return fetch(SysUserGroup.SYS_USER_GROUP.USERID, values);
    }

    /**
     * Fetch records that have <code>groupId IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysUserGroup> fetchByGroupid(String... values) {
        return fetch(SysUserGroup.SYS_USER_GROUP.GROUPID, values);
    }
}