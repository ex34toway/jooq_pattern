/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.records;


import com.nanhu.model.sys.tables.SysPosition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysPositionRecord extends UpdatableRecordImpl<SysPositionRecord> implements Record11<String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 963760211;

    /**
     * Setter for <code>spring_boot.sys_position.id</code>. 职位ID
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.id</code>. 职位ID
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>spring_boot.sys_position.positionName</code>. 职位名称
     */
    public void setPositionname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.positionName</code>. 职位名称
     */
    public String getPositionname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring_boot.sys_position.positionCode</code>. 职位编码
     */
    public void setPositioncode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.positionCode</code>. 职位编码
     */
    public String getPositioncode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>spring_boot.sys_position.positionParentId</code>. 职位父节点Id
     */
    public void setPositionparentid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.positionParentId</code>. 职位父节点Id
     */
    public String getPositionparentid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>spring_boot.sys_position.status</code>. 状态(99：删除,10：启用 ,20：禁用)
     */
    public void setStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.status</code>. 状态(99：删除,10：启用 ,20：禁用)
     */
    public Byte getStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>spring_boot.sys_position.sort</code>.
     */
    public void setSort(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.sort</code>.
     */
    public Byte getSort() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>spring_boot.sys_position.creator</code>.
     */
    public void setCreator(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.creator</code>.
     */
    public String getCreator() {
        return (String) get(6);
    }

    /**
     * Setter for <code>spring_boot.sys_position.modifier</code>.
     */
    public void setModifier(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.modifier</code>.
     */
    public String getModifier() {
        return (String) get(7);
    }

    /**
     * Setter for <code>spring_boot.sys_position.createDate</code>. 创建时间
     */
    public void setCreatedate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.createDate</code>. 创建时间
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>spring_boot.sys_position.modifyDate</code>. 修改时间
     */
    public void setModifydate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.modifyDate</code>. 修改时间
     */
    public Timestamp getModifydate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>spring_boot.sys_position.remark</code>. 备注
     */
    public void setRemark(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>spring_boot.sys_position.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, Byte, Byte, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SysPosition.SYS_POSITION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysPosition.SYS_POSITION.POSITIONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SysPosition.SYS_POSITION.POSITIONCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysPosition.SYS_POSITION.POSITIONPARENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return SysPosition.SYS_POSITION.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return SysPosition.SYS_POSITION.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SysPosition.SYS_POSITION.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SysPosition.SYS_POSITION.MODIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return SysPosition.SYS_POSITION.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return SysPosition.SYS_POSITION.MODIFYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SysPosition.SYS_POSITION.REMARK;
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
        return getPositionname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPositioncode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPositionparentid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getModifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getModifydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value2(String value) {
        setPositionname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value3(String value) {
        setPositioncode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value4(String value) {
        setPositionparentid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value5(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value6(Byte value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value7(String value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value8(String value) {
        setModifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value9(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value10(Timestamp value) {
        setModifydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord value11(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPositionRecord values(String value1, String value2, String value3, String value4, Byte value5, Byte value6, String value7, String value8, Timestamp value9, Timestamp value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysPositionRecord
     */
    public SysPositionRecord() {
        super(SysPosition.SYS_POSITION);
    }

    /**
     * Create a detached, initialised SysPositionRecord
     */
    public SysPositionRecord(String id, String positionname, String positioncode, String positionparentid, Byte status, Byte sort, String creator, String modifier, Timestamp createdate, Timestamp modifydate, String remark) {
        super(SysPosition.SYS_POSITION);

        set(0, id);
        set(1, positionname);
        set(2, positioncode);
        set(3, positionparentid);
        set(4, status);
        set(5, sort);
        set(6, creator);
        set(7, modifier);
        set(8, createdate);
        set(9, modifydate);
        set(10, remark);
    }
}
