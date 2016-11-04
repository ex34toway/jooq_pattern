/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables;


import com.nanhu.model.sys.SpringBoot;
import com.nanhu.model.sys.tables.records.SysMemberRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * 组织成员关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysMember extends TableImpl<SysMemberRecord> {

    private static final long serialVersionUID = -1738851751;

    /**
     * The reference instance of <code>spring_boot.sys_member</code>
     */
    public static final SysMember SYS_MEMBER = new SysMember();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysMemberRecord> getRecordType() {
        return SysMemberRecord.class;
    }

    /**
     * The column <code>spring_boot.sys_member.id</code>. 成员ID
     */
    public final TableField<SysMemberRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "成员ID");

    /**
     * The column <code>spring_boot.sys_member.userId</code>. 用户ID
     */
    public final TableField<SysMemberRecord, String> USERID = createField("userId", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "用户ID");

    /**
     * The column <code>spring_boot.sys_member.orgId</code>. 组织机构ID
     */
    public final TableField<SysMemberRecord, String> ORGID = createField("orgId", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "组织机构ID");

    /**
     * The column <code>spring_boot.sys_member.positionId</code>. 职位ID
     */
    public final TableField<SysMemberRecord, String> POSITIONID = createField("positionId", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "职位ID");

    /**
     * The column <code>spring_boot.sys_member.depId</code>. 部门(组)ID
     */
    public final TableField<SysMemberRecord, String> DEPID = createField("depId", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "部门(组)ID");

    /**
     * The column <code>spring_boot.sys_member.roleId</code>. 角色ID
     */
    public final TableField<SysMemberRecord, String> ROLEID = createField("roleId", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "角色ID");

    /**
     * The column <code>spring_boot.sys_member.roleCode</code>. 角色编码
     */
    public final TableField<SysMemberRecord, String> ROLECODE = createField("roleCode", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "角色编码");

    /**
     * The column <code>spring_boot.sys_member.status</code>. 状态(99：删除,10：启用 ,20：禁用)
     */
    public final TableField<SysMemberRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "状态(99：删除,10：启用 ,20：禁用)");

    /**
     * The column <code>spring_boot.sys_member.sort</code>. 排序
     */
    public final TableField<SysMemberRecord, Byte> SORT = createField("sort", org.jooq.impl.SQLDataType.TINYINT, this, "排序");

    /**
     * The column <code>spring_boot.sys_member.creator</code>. 创建用户Id
     */
    public final TableField<SysMemberRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "创建用户Id");

    /**
     * The column <code>spring_boot.sys_member.modifier</code>. 修改用户Id
     */
    public final TableField<SysMemberRecord, String> MODIFIER = createField("modifier", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "修改用户Id");

    /**
     * The column <code>spring_boot.sys_member.createDate</code>. 创建时间
     */
    public final TableField<SysMemberRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>spring_boot.sys_member.modifyDate</code>. 修改时间
     */
    public final TableField<SysMemberRecord, Timestamp> MODIFYDATE = createField("modifyDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>spring_boot.sys_member.remark</code>. 备注
     */
    public final TableField<SysMemberRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");

    /**
     * Create a <code>spring_boot.sys_member</code> table reference
     */
    public SysMember() {
        this("sys_member", null);
    }

    /**
     * Create an aliased <code>spring_boot.sys_member</code> table reference
     */
    public SysMember(String alias) {
        this(alias, SYS_MEMBER);
    }

    private SysMember(String alias, Table<SysMemberRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysMember(String alias, Table<SysMemberRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "组织成员关系表");
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
    public SysMember as(String alias) {
        return new SysMember(alias, this);
    }

    /**
     * Rename this table
     */
    public SysMember rename(String name) {
        return new SysMember(name, null);
    }
}
