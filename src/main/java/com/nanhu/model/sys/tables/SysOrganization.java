/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables;


import com.nanhu.model.sys.SpringBoot;
import com.nanhu.model.sys.tables.records.SysOrganizationRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysOrganization extends TableImpl<SysOrganizationRecord> {

    private static final long serialVersionUID = 1476949774;

    /**
     * The reference instance of <code>spring_boot.sys_organization</code>
     */
    public static final SysOrganization SYS_ORGANIZATION = new SysOrganization();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysOrganizationRecord> getRecordType() {
        return SysOrganizationRecord.class;
    }

    /**
     * The column <code>spring_boot.sys_organization.id</code>. 组织机构ID
     */
    public final TableField<SysOrganizationRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "组织机构ID");

    /**
     * The column <code>spring_boot.sys_organization.orgName</code>. 组织机构名称
     */
    public final TableField<SysOrganizationRecord, String> ORGNAME = createField("orgName", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "组织机构名称");

    /**
     * The column <code>spring_boot.sys_organization.orgCode</code>. 组织机构编码
     */
    public final TableField<SysOrganizationRecord, String> ORGCODE = createField("orgCode", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "组织机构编码");

    /**
     * The column <code>spring_boot.sys_organization.orgParentId</code>. 组织机构父节点Id
     */
    public final TableField<SysOrganizationRecord, String> ORGPARENTID = createField("orgParentId", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "组织机构父节点Id");

    /**
     * The column <code>spring_boot.sys_organization.isIndependent</code>. 是否独立核算(1：启用 ,0：禁用)
     */
    public final TableField<SysOrganizationRecord, Byte> ISINDEPENDENT = createField("isIndependent", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否独立核算(1：启用 ,0：禁用)");

    /**
     * The column <code>spring_boot.sys_organization.isVirtualAccounts</code>. 是否独立虚拟账户(1：启用 ,0：禁用)
     */
    public final TableField<SysOrganizationRecord, Byte> ISVIRTUALACCOUNTS = createField("isVirtualAccounts", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否独立虚拟账户(1：启用 ,0：禁用)");

    /**
     * The column <code>spring_boot.sys_organization.orgLevel</code>. 组织级别（100：总部、888：平台、999、其他）
     */
    public final TableField<SysOrganizationRecord, Integer> ORGLEVEL = createField("orgLevel", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("999", org.jooq.impl.SQLDataType.INTEGER)), this, "组织级别（100：总部、888：平台、999、其他）");

    /**
     * The column <code>spring_boot.sys_organization.status</code>. 状态状态(99：删除,10：启用 ,20：禁用)
     */
    public final TableField<SysOrganizationRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "状态状态(99：删除,10：启用 ,20：禁用)");

    /**
     * The column <code>spring_boot.sys_organization.sort</code>. 排序
     */
    public final TableField<SysOrganizationRecord, Byte> SORT = createField("sort", org.jooq.impl.SQLDataType.TINYINT, this, "排序");

    /**
     * The column <code>spring_boot.sys_organization.creator</code>. 创建用户Id
     */
    public final TableField<SysOrganizationRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "创建用户Id");

    /**
     * The column <code>spring_boot.sys_organization.modifier</code>. 修改用户Id
     */
    public final TableField<SysOrganizationRecord, String> MODIFIER = createField("modifier", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "修改用户Id");

    /**
     * The column <code>spring_boot.sys_organization.createDate</code>. 创建时间
     */
    public final TableField<SysOrganizationRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>spring_boot.sys_organization.modifyDate</code>. 修改时间
     */
    public final TableField<SysOrganizationRecord, Timestamp> MODIFYDATE = createField("modifyDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>spring_boot.sys_organization.remark</code>. 备注
     */
    public final TableField<SysOrganizationRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");

    /**
     * Create a <code>spring_boot.sys_organization</code> table reference
     */
    public SysOrganization() {
        this("sys_organization", null);
    }

    /**
     * Create an aliased <code>spring_boot.sys_organization</code> table reference
     */
    public SysOrganization(String alias) {
        this(alias, SYS_ORGANIZATION);
    }

    private SysOrganization(String alias, Table<SysOrganizationRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysOrganization(String alias, Table<SysOrganizationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public SysOrganization as(String alias) {
        return new SysOrganization(alias, this);
    }

    /**
     * Rename this table
     */
    public SysOrganization rename(String name) {
        return new SysOrganization(name, null);
    }
}