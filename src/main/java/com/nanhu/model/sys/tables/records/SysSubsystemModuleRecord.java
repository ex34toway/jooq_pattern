/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.records;


import com.nanhu.model.sys.tables.SysSubsystemModule;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 子系统模块
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysSubsystemModuleRecord extends UpdatableRecordImpl<SysSubsystemModuleRecord> implements Record12<String, String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = -488012843;

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.subSystemId</code>.
     */
    public void setSubsystemid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.subSystemId</code>.
     */
    public String getSubsystemid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.moduleName</code>.
     */
    public void setModulename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.moduleName</code>.
     */
    public String getModulename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.moduleCode</code>.
     */
    public void setModulecode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.moduleCode</code>.
     */
    public String getModulecode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.moduleParentId</code>.
     */
    public void setModuleparentid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.moduleParentId</code>.
     */
    public String getModuleparentid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.status</code>.
     */
    public void setStatus(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.sort</code>.
     */
    public void setSort(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.sort</code>.
     */
    public Byte getSort() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.creator</code>.
     */
    public void setCreator(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.creator</code>.
     */
    public String getCreator() {
        return (String) get(7);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.modifier</code>.
     */
    public void setModifier(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.modifier</code>.
     */
    public String getModifier() {
        return (String) get(8);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.createDate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.createDate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.modifyDate</code>.
     */
    public void setModifydate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.modifyDate</code>.
     */
    public Timestamp getModifydate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>spring_boot.sys_subsystem_module.remark</code>.
     */
    public void setRemark(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>spring_boot.sys_subsystem_module.remark</code>.
     */
    public String getRemark() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.SUBSYSTEMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.MODULENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.MODULECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.MODULEPARENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.MODIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.MODIFYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return SysSubsystemModule.SYS_SUBSYSTEM_MODULE.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSubsystemid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getModulename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getModulecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getModuleparentid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getModifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getModifydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value2(String value) {
        setSubsystemid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value3(String value) {
        setModulename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value4(String value) {
        setModulecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value5(String value) {
        setModuleparentid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value6(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value7(Byte value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value8(String value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value9(String value) {
        setModifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value10(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value11(Timestamp value) {
        setModifydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord value12(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModuleRecord values(String value1, String value2, String value3, String value4, String value5, Byte value6, Byte value7, String value8, String value9, Timestamp value10, Timestamp value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysSubsystemModuleRecord
     */
    public SysSubsystemModuleRecord() {
        super(SysSubsystemModule.SYS_SUBSYSTEM_MODULE);
    }

    /**
     * Create a detached, initialised SysSubsystemModuleRecord
     */
    public SysSubsystemModuleRecord(String id, String subsystemid, String modulename, String modulecode, String moduleparentid, Byte status, Byte sort, String creator, String modifier, Timestamp createdate, Timestamp modifydate, String remark) {
        super(SysSubsystemModule.SYS_SUBSYSTEM_MODULE);

        set(0, id);
        set(1, subsystemid);
        set(2, modulename);
        set(3, modulecode);
        set(4, moduleparentid);
        set(5, status);
        set(6, sort);
        set(7, creator);
        set(8, modifier);
        set(9, createdate);
        set(10, modifydate);
        set(11, remark);
    }
}