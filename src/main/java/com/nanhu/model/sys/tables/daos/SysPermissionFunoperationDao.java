/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.daos;


import com.nanhu.model.sys.tables.SysPermissionFunoperation;
import com.nanhu.model.sys.tables.records.SysPermissionFunoperationRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 权限操作关联表
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
public class SysPermissionFunoperationDao extends DAOImpl<SysPermissionFunoperationRecord, com.nanhu.model.sys.tables.pojos.SysPermissionFunoperation, Record2<String, String>> {

    /**
     * Create a new SysPermissionFunoperationDao without any configuration
     */
    public SysPermissionFunoperationDao() {
        super(SysPermissionFunoperation.SYS_PERMISSION_FUNOPERATION, com.nanhu.model.sys.tables.pojos.SysPermissionFunoperation.class);
    }

    /**
     * Create a new SysPermissionFunoperationDao with an attached configuration
     */
    @Autowired
    public SysPermissionFunoperationDao(Configuration configuration) {
        super(SysPermissionFunoperation.SYS_PERMISSION_FUNOPERATION, com.nanhu.model.sys.tables.pojos.SysPermissionFunoperation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(com.nanhu.model.sys.tables.pojos.SysPermissionFunoperation object) {
        return compositeKeyRecord(object.getFunid(), object.getResourcesid());
    }

    /**
     * Fetch records that have <code>funId IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysPermissionFunoperation> fetchByFunid(String... values) {
        return fetch(SysPermissionFunoperation.SYS_PERMISSION_FUNOPERATION.FUNID, values);
    }

    /**
     * Fetch records that have <code>resourcesId IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysPermissionFunoperation> fetchByResourcesid(String... values) {
        return fetch(SysPermissionFunoperation.SYS_PERMISSION_FUNOPERATION.RESOURCESID, values);
    }
}
