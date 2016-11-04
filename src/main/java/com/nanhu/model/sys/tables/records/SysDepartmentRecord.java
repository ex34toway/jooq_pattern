/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.records;


import com.nanhu.model.sys.tables.SysDepartment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


/**
 * 部门
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysDepartmentRecord extends TableRecordImpl<SysDepartmentRecord> implements Record13<String, String, String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 360654092;

    /**
     * Setter for <code>spring_boot.sys_department.id</code>. 组ID
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.id</code>. 组ID
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>spring_boot.sys_department.depCode</code>. 部门编码
     */
    public void setDepcode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.depCode</code>. 部门编码
     */
    public String getDepcode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring_boot.sys_department.depName</code>. 组名称
     */
    public void setDepname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.depName</code>. 组名称
     */
    public String getDepname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>spring_boot.sys_department.orgId</code>. 组织ID
     */
    public void setOrgid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.orgId</code>. 组织ID
     */
    public String getOrgid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>spring_boot.sys_department.orgCode</code>. 公司编码
     */
    public void setOrgcode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.orgCode</code>. 公司编码
     */
    public String getOrgcode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>spring_boot.sys_department.depParentId</code>. 组父节点
     */
    public void setDepparentid(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.depParentId</code>. 组父节点
     */
    public String getDepparentid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>spring_boot.sys_department.status</code>. 状态(99：删除,10：启用 ,20：禁用)
     */
    public void setStatus(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.status</code>. 状态(99：删除,10：启用 ,20：禁用)
     */
    public Byte getStatus() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>spring_boot.sys_department.sort</code>. 排序
     */
    public void setSort(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.sort</code>. 排序
     */
    public Byte getSort() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>spring_boot.sys_department.creator</code>. 创建用户Id
     */
    public void setCreator(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.creator</code>. 创建用户Id
     */
    public String getCreator() {
        return (String) get(8);
    }

    /**
     * Setter for <code>spring_boot.sys_department.modifier</code>. 修改用户Id
     */
    public void setModifier(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.modifier</code>. 修改用户Id
     */
    public String getModifier() {
        return (String) get(9);
    }

    /**
     * Setter for <code>spring_boot.sys_department.createDate</code>. 创建时间
     */
    public void setCreatedate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.createDate</code>. 创建时间
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>spring_boot.sys_department.modifyDate</code>. 修改时间
     */
    public void setModifydate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.modifyDate</code>. 修改时间
     */
    public Timestamp getModifydate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>spring_boot.sys_department.remark</code>. 备注
     */
    public void setRemark(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>spring_boot.sys_department.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(12);
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
        return SysDepartment.SYS_DEPARTMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysDepartment.SYS_DEPARTMENT.DEPCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SysDepartment.SYS_DEPARTMENT.DEPNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysDepartment.SYS_DEPARTMENT.ORGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SysDepartment.SYS_DEPARTMENT.ORGCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SysDepartment.SYS_DEPARTMENT.DEPPARENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return SysDepartment.SYS_DEPARTMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return SysDepartment.SYS_DEPARTMENT.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SysDepartment.SYS_DEPARTMENT.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SysDepartment.SYS_DEPARTMENT.MODIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return SysDepartment.SYS_DEPARTMENT.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return SysDepartment.SYS_DEPARTMENT.MODIFYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SysDepartment.SYS_DEPARTMENT.REMARK;
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
        return getDepcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDepname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOrgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOrgcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDepparentid();
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
    public SysDepartmentRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value2(String value) {
        setDepcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value3(String value) {
        setDepname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value4(String value) {
        setOrgid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value5(String value) {
        setOrgcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value6(String value) {
        setDepparentid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value7(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value8(Byte value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value9(String value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value10(String value) {
        setModifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value11(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value12(Timestamp value) {
        setModifydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord value13(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysDepartmentRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Byte value7, Byte value8, String value9, String value10, Timestamp value11, Timestamp value12, String value13) {
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
     * Create a detached SysDepartmentRecord
     */
    public SysDepartmentRecord() {
        super(SysDepartment.SYS_DEPARTMENT);
    }

    /**
     * Create a detached, initialised SysDepartmentRecord
     */
    public SysDepartmentRecord(String id, String depcode, String depname, String orgid, String orgcode, String depparentid, Byte status, Byte sort, String creator, String modifier, Timestamp createdate, Timestamp modifydate, String remark) {
        super(SysDepartment.SYS_DEPARTMENT);

        set(0, id);
        set(1, depcode);
        set(2, depname);
        set(3, orgid);
        set(4, orgcode);
        set(5, depparentid);
        set(6, status);
        set(7, sort);
        set(8, creator);
        set(9, modifier);
        set(10, createdate);
        set(11, modifydate);
        set(12, remark);
    }
}