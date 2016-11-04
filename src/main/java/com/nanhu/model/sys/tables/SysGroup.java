/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables;


import com.nanhu.model.sys.Keys;
import com.nanhu.model.sys.SpringBoot;
import com.nanhu.model.sys.tables.records.SysGroupRecord;

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
 * 组
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysGroup extends TableImpl<SysGroupRecord> {

    private static final long serialVersionUID = -976288210;

    /**
     * The reference instance of <code>spring_boot.sys_group</code>
     */
    public static final SysGroup SYS_GROUP = new SysGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysGroupRecord> getRecordType() {
        return SysGroupRecord.class;
    }

    /**
     * The column <code>spring_boot.sys_group.id</code>.
     */
    public final TableField<SysGroupRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_group.groupName</code>.
     */
    public final TableField<SysGroupRecord, String> GROUPNAME = createField("groupName", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_group.groupParentId</code>.
     */
    public final TableField<SysGroupRecord, String> GROUPPARENTID = createField("groupParentId", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_group.status</code>.
     */
    public final TableField<SysGroupRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>spring_boot.sys_group.sort</code>.
     */
    public final TableField<SysGroupRecord, Byte> SORT = createField("sort", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>spring_boot.sys_group.creator</code>.
     */
    public final TableField<SysGroupRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_group.modifier</code>.
     */
    public final TableField<SysGroupRecord, String> MODIFIER = createField("modifier", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_group.createDate</code>.
     */
    public final TableField<SysGroupRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>spring_boot.sys_group.modifyDate</code>.
     */
    public final TableField<SysGroupRecord, Timestamp> MODIFYDATE = createField("modifyDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>spring_boot.sys_group.remark</code>.
     */
    public final TableField<SysGroupRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>spring_boot.sys_group</code> table reference
     */
    public SysGroup() {
        this("sys_group", null);
    }

    /**
     * Create an aliased <code>spring_boot.sys_group</code> table reference
     */
    public SysGroup(String alias) {
        this(alias, SYS_GROUP);
    }

    private SysGroup(String alias, Table<SysGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysGroup(String alias, Table<SysGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "组");
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
    public UniqueKey<SysGroupRecord> getPrimaryKey() {
        return Keys.KEY_SYS_GROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<SysGroupRecord>>asList(Keys.KEY_SYS_GROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysGroup as(String alias) {
        return new SysGroup(alias, this);
    }

    /**
     * Rename this table
     */
    public SysGroup rename(String name) {
        return new SysGroup(name, null);
    }
}
