/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables;


import com.nanhu.model.sys.Keys;
import com.nanhu.model.sys.SpringBoot;
import com.nanhu.model.sys.tables.records.SysOrgDepartmentPositionRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class SysOrgDepartmentPosition extends TableImpl<SysOrgDepartmentPositionRecord> {

    private static final long serialVersionUID = 1393133758;

    /**
     * The reference instance of <code>spring_boot.sys_org_department_position</code>
     */
    public static final SysOrgDepartmentPosition SYS_ORG_DEPARTMENT_POSITION = new SysOrgDepartmentPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysOrgDepartmentPositionRecord> getRecordType() {
        return SysOrgDepartmentPositionRecord.class;
    }

    /**
     * The column <code>spring_boot.sys_org_department_position.orgId</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, String> ORGID = createField("orgId", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_org_department_position.positionId</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, String> POSITIONID = createField("positionId", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_org_department_position.depId</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, String> DEPID = createField("depId", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_org_department_position.status</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>spring_boot.sys_org_department_position.sort</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, Byte> SORT = createField("sort", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>spring_boot.sys_org_department_position.creator</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_org_department_position.modifier</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, String> MODIFIER = createField("modifier", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_org_department_position.createDate</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>spring_boot.sys_org_department_position.modifyDate</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, Timestamp> MODIFYDATE = createField("modifyDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>spring_boot.sys_org_department_position.remark</code>.
     */
    public final TableField<SysOrgDepartmentPositionRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>spring_boot.sys_org_department_position</code> table reference
     */
    public SysOrgDepartmentPosition() {
        this("sys_org_department_position", null);
    }

    /**
     * Create an aliased <code>spring_boot.sys_org_department_position</code> table reference
     */
    public SysOrgDepartmentPosition(String alias) {
        this(alias, SYS_ORG_DEPARTMENT_POSITION);
    }

    private SysOrgDepartmentPosition(String alias, Table<SysOrgDepartmentPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysOrgDepartmentPosition(String alias, Table<SysOrgDepartmentPositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "组织部门与组织岗位");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return SpringBoot.SPRING_BOOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SysOrgDepartmentPositionRecord> getPrimaryKey() {
        return Keys.KEY_SYS_ORG_DEPARTMENT_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysOrgDepartmentPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<SysOrgDepartmentPositionRecord>>asList(Keys.KEY_SYS_ORG_DEPARTMENT_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysOrgDepartmentPosition as(String alias) {
        return new SysOrgDepartmentPosition(alias, this);
    }

    /**
     * Rename this table
     */
    public SysOrgDepartmentPosition rename(String name) {
        return new SysOrgDepartmentPosition(name, null);
    }
}