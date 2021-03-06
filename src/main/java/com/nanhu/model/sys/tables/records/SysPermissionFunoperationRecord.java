/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.records;


import com.nanhu.model.sys.tables.SysPermissionFunoperation;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SysPermissionFunoperationRecord extends UpdatableRecordImpl<SysPermissionFunoperationRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1974285296;

    /**
     * Setter for <code>spring_boot.sys_permission_funoperation.funId</code>.
     */
    public void setFunid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring_boot.sys_permission_funoperation.funId</code>.
     */
    public String getFunid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>spring_boot.sys_permission_funoperation.resourcesId</code>.
     */
    public void setResourcesid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring_boot.sys_permission_funoperation.resourcesId</code>.
     */
    public String getResourcesid() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SysPermissionFunoperation.SYS_PERMISSION_FUNOPERATION.FUNID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysPermissionFunoperation.SYS_PERMISSION_FUNOPERATION.RESOURCESID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFunid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getResourcesid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionFunoperationRecord value1(String value) {
        setFunid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionFunoperationRecord value2(String value) {
        setResourcesid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPermissionFunoperationRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysPermissionFunoperationRecord
     */
    public SysPermissionFunoperationRecord() {
        super(SysPermissionFunoperation.SYS_PERMISSION_FUNOPERATION);
    }

    /**
     * Create a detached, initialised SysPermissionFunoperationRecord
     */
    public SysPermissionFunoperationRecord(String funid, String resourcesid) {
        super(SysPermissionFunoperation.SYS_PERMISSION_FUNOPERATION);

        set(0, funid);
        set(1, resourcesid);
    }
}
