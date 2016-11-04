/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.records;


import com.nanhu.model.sys.tables.SysFunctionoperation;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 功能操作表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysFunctionoperationRecord extends UpdatableRecordImpl<SysFunctionoperationRecord> implements Record13<String, String, String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = -170753705;

    /**
     * Setter for <code>spring_boot.sys_functionoperation.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.moduleId</code>.
     */
    public void setModuleid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.moduleId</code>.
     */
    public String getModuleid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.funName</code>.
     */
    public void setFunname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.funName</code>.
     */
    public String getFunname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.funParentId</code>.
     */
    public void setFunparentid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.funParentId</code>.
     */
    public String getFunparentid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.funCode</code>.
     */
    public void setFuncode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.funCode</code>.
     */
    public String getFuncode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.interceptPrefix</code>.
     */
    public void setInterceptprefix(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.interceptPrefix</code>.
     */
    public String getInterceptprefix() {
        return (String) get(5);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.status</code>.
     */
    public void setStatus(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.sort</code>.
     */
    public void setSort(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.sort</code>.
     */
    public Byte getSort() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.creator</code>.
     */
    public void setCreator(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.creator</code>.
     */
    public String getCreator() {
        return (String) get(8);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.modifier</code>.
     */
    public void setModifier(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.modifier</code>.
     */
    public String getModifier() {
        return (String) get(9);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.createDate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.createDate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.modifyDate</code>.
     */
    public void setModifydate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.modifyDate</code>.
     */
    public Timestamp getModifydate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>spring_boot.sys_functionoperation.remark</code>.
     */
    public void setRemark(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>spring_boot.sys_functionoperation.remark</code>.
     */
    public String getRemark() {
        return (String) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.MODULEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.FUNNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.FUNPARENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.FUNCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.INTERCEPTPREFIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.MODIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.MODIFYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SysFunctionoperation.SYS_FUNCTIONOPERATION.REMARK;
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
        return getModuleid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFunname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFunparentid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFuncode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getInterceptprefix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getModifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getModifydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value2(String value) {
        setModuleid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value3(String value) {
        setFunname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value4(String value) {
        setFunparentid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value5(String value) {
        setFuncode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value6(String value) {
        setInterceptprefix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value7(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value8(Byte value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value9(String value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value10(String value) {
        setModifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value11(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value12(Timestamp value) {
        setModifydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord value13(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperationRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Byte value7, Byte value8, String value9, String value10, Timestamp value11, Timestamp value12, String value13) {
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
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysFunctionoperationRecord
     */
    public SysFunctionoperationRecord() {
        super(SysFunctionoperation.SYS_FUNCTIONOPERATION);
    }

    /**
     * Create a detached, initialised SysFunctionoperationRecord
     */
    public SysFunctionoperationRecord(String id, String moduleid, String funname, String funparentid, String funcode, String interceptprefix, Byte status, Byte sort, String creator, String modifier, Timestamp createdate, Timestamp modifydate, String remark) {
        super(SysFunctionoperation.SYS_FUNCTIONOPERATION);

        set(0, id);
        set(1, moduleid);
        set(2, funname);
        set(3, funparentid);
        set(4, funcode);
        set(5, interceptprefix);
        set(6, status);
        set(7, sort);
        set(8, creator);
        set(9, modifier);
        set(10, createdate);
        set(11, modifydate);
        set(12, remark);
    }
}