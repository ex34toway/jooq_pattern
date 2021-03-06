/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.records;


import com.nanhu.model.sys.tables.SysResources;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * 资源表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysResourcesRecord extends TableRecordImpl<SysResourcesRecord> implements Record10<String, String, Byte, Byte, Byte, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 1021821577;

    /**
     * Setter for <code>spring_boot.sys_resources.id</code>. 资源ID
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.id</code>. 资源ID
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>spring_boot.sys_resources.resourcesName</code>. 资源名称
     */
    public void setResourcesname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.resourcesName</code>. 资源名称
     */
    public String getResourcesname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring_boot.sys_resources.resourcesType</code>. 资源类型（10：访问子系统、20：菜单访问、30：功能操作）
     */
    public void setResourcestype(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.resourcesType</code>. 资源类型（10：访问子系统、20：菜单访问、30：功能操作）
     */
    public Byte getResourcestype() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>spring_boot.sys_resources.status</code>. 状态(99：删除,10：启用 ,20：禁用)
     */
    public void setStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.status</code>. 状态(99：删除,10：启用 ,20：禁用)
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>spring_boot.sys_resources.sort</code>. 排序
     */
    public void setSort(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.sort</code>. 排序
     */
    public Byte getSort() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>spring_boot.sys_resources.creator</code>. 创建用户Id
     */
    public void setCreator(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.creator</code>. 创建用户Id
     */
    public String getCreator() {
        return (String) get(5);
    }

    /**
     * Setter for <code>spring_boot.sys_resources.modifier</code>. 修改用户Id
     */
    public void setModifier(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.modifier</code>. 修改用户Id
     */
    public String getModifier() {
        return (String) get(6);
    }

    /**
     * Setter for <code>spring_boot.sys_resources.createDate</code>. 创建时间
     */
    public void setCreatedate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.createDate</code>. 创建时间
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>spring_boot.sys_resources.modifyDate</code>. 修改时间
     */
    public void setModifydate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.modifyDate</code>. 修改时间
     */
    public Timestamp getModifydate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>spring_boot.sys_resources.remark</code>. 备注
     */
    public void setRemark(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>spring_boot.sys_resources.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, Byte, Byte, Byte, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, Byte, Byte, Byte, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SysResources.SYS_RESOURCES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysResources.SYS_RESOURCES.RESOURCESNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return SysResources.SYS_RESOURCES.RESOURCESTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return SysResources.SYS_RESOURCES.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return SysResources.SYS_RESOURCES.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SysResources.SYS_RESOURCES.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SysResources.SYS_RESOURCES.MODIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return SysResources.SYS_RESOURCES.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return SysResources.SYS_RESOURCES.MODIFYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SysResources.SYS_RESOURCES.REMARK;
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
        return getResourcesname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getResourcestype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getModifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getModifydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value2(String value) {
        setResourcesname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value3(Byte value) {
        setResourcestype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value5(Byte value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value6(String value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value7(String value) {
        setModifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value8(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value9(Timestamp value) {
        setModifydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord value10(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysResourcesRecord values(String value1, String value2, Byte value3, Byte value4, Byte value5, String value6, String value7, Timestamp value8, Timestamp value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysResourcesRecord
     */
    public SysResourcesRecord() {
        super(SysResources.SYS_RESOURCES);
    }

    /**
     * Create a detached, initialised SysResourcesRecord
     */
    public SysResourcesRecord(String id, String resourcesname, Byte resourcestype, Byte status, Byte sort, String creator, String modifier, Timestamp createdate, Timestamp modifydate, String remark) {
        super(SysResources.SYS_RESOURCES);

        set(0, id);
        set(1, resourcesname);
        set(2, resourcestype);
        set(3, status);
        set(4, sort);
        set(5, creator);
        set(6, modifier);
        set(7, createdate);
        set(8, modifydate);
        set(9, remark);
    }
}
