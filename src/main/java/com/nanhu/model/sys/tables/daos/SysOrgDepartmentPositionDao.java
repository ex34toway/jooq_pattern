/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.daos;


import com.nanhu.model.sys.tables.SysOrgDepartmentPosition;
import com.nanhu.model.sys.tables.records.SysOrgDepartmentPositionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record3;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 组织部门与组织岗位
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
public class SysOrgDepartmentPositionDao extends DAOImpl<SysOrgDepartmentPositionRecord, com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition, Record3<String, String, String>> {

    /**
     * Create a new SysOrgDepartmentPositionDao without any configuration
     */
    public SysOrgDepartmentPositionDao() {
        super(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION, com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition.class);
    }

    /**
     * Create a new SysOrgDepartmentPositionDao with an attached configuration
     */
    @Autowired
    public SysOrgDepartmentPositionDao(Configuration configuration) {
        super(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION, com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record3<String, String, String> getId(com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition object) {
        return compositeKeyRecord(object.getOrgid(), object.getPositionid(), object.getDepid());
    }

    /**
     * Fetch records that have <code>orgId IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchByOrgid(String... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.ORGID, values);
    }

    /**
     * Fetch records that have <code>positionId IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchByPositionid(String... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.POSITIONID, values);
    }

    /**
     * Fetch records that have <code>depId IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchByDepid(String... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.DEPID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchByStatus(Byte... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.STATUS, values);
    }

    /**
     * Fetch records that have <code>sort IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchBySort(Byte... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.SORT, values);
    }

    /**
     * Fetch records that have <code>creator IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchByCreator(String... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.CREATOR, values);
    }

    /**
     * Fetch records that have <code>modifier IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchByModifier(String... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.MODIFIER, values);
    }

    /**
     * Fetch records that have <code>createDate IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchByCreatedate(Timestamp... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.CREATEDATE, values);
    }

    /**
     * Fetch records that have <code>modifyDate IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchByModifydate(Timestamp... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.MODIFYDATE, values);
    }

    /**
     * Fetch records that have <code>remark IN (values)</code>
     */
    public List<com.nanhu.model.sys.tables.pojos.SysOrgDepartmentPosition> fetchByRemark(String... values) {
        return fetch(SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION.REMARK, values);
    }
}