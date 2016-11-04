/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables;


import com.nanhu.model.sys.Keys;
import com.nanhu.model.sys.SpringBoot;
import com.nanhu.model.sys.tables.records.SysSubsystemModuleRecord;

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
public class SysSubsystemModule extends TableImpl<SysSubsystemModuleRecord> {

    private static final long serialVersionUID = -64007451;

    /**
     * The reference instance of <code>spring_boot.sys_subsystem_module</code>
     */
    public static final SysSubsystemModule SYS_SUBSYSTEM_MODULE = new SysSubsystemModule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysSubsystemModuleRecord> getRecordType() {
        return SysSubsystemModuleRecord.class;
    }

    /**
     * The column <code>spring_boot.sys_subsystem_module.id</code>.
     */
    public final TableField<SysSubsystemModuleRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.subSystemId</code>.
     */
    public final TableField<SysSubsystemModuleRecord, String> SUBSYSTEMID = createField("subSystemId", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.moduleName</code>.
     */
    public final TableField<SysSubsystemModuleRecord, String> MODULENAME = createField("moduleName", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.moduleCode</code>.
     */
    public final TableField<SysSubsystemModuleRecord, String> MODULECODE = createField("moduleCode", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.moduleParentId</code>.
     */
    public final TableField<SysSubsystemModuleRecord, String> MODULEPARENTID = createField("moduleParentId", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.status</code>.
     */
    public final TableField<SysSubsystemModuleRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.sort</code>.
     */
    public final TableField<SysSubsystemModuleRecord, Byte> SORT = createField("sort", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.creator</code>.
     */
    public final TableField<SysSubsystemModuleRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.modifier</code>.
     */
    public final TableField<SysSubsystemModuleRecord, String> MODIFIER = createField("modifier", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.createDate</code>.
     */
    public final TableField<SysSubsystemModuleRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.modifyDate</code>.
     */
    public final TableField<SysSubsystemModuleRecord, Timestamp> MODIFYDATE = createField("modifyDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>spring_boot.sys_subsystem_module.remark</code>.
     */
    public final TableField<SysSubsystemModuleRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>spring_boot.sys_subsystem_module</code> table reference
     */
    public SysSubsystemModule() {
        this("sys_subsystem_module", null);
    }

    /**
     * Create an aliased <code>spring_boot.sys_subsystem_module</code> table reference
     */
    public SysSubsystemModule(String alias) {
        this(alias, SYS_SUBSYSTEM_MODULE);
    }

    private SysSubsystemModule(String alias, Table<SysSubsystemModuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysSubsystemModule(String alias, Table<SysSubsystemModuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "子系统模块");
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
    public UniqueKey<SysSubsystemModuleRecord> getPrimaryKey() {
        return Keys.KEY_SYS_SUBSYSTEM_MODULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysSubsystemModuleRecord>> getKeys() {
        return Arrays.<UniqueKey<SysSubsystemModuleRecord>>asList(Keys.KEY_SYS_SUBSYSTEM_MODULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysSubsystemModule as(String alias) {
        return new SysSubsystemModule(alias, this);
    }

    /**
     * Rename this table
     */
    public SysSubsystemModule rename(String name) {
        return new SysSubsystemModule(name, null);
    }
}
