/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables;


import com.nanhu.model.sys.Keys;
import com.nanhu.model.sys.SpringBoot;
import com.nanhu.model.sys.tables.records.SysFunctionoperationRecord;

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
public class SysFunctionoperation extends TableImpl<SysFunctionoperationRecord> {

    private static final long serialVersionUID = 1549348461;

    /**
     * The reference instance of <code>spring_boot.sys_functionoperation</code>
     */
    public static final SysFunctionoperation SYS_FUNCTIONOPERATION = new SysFunctionoperation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysFunctionoperationRecord> getRecordType() {
        return SysFunctionoperationRecord.class;
    }

    /**
     * The column <code>spring_boot.sys_functionoperation.id</code>.
     */
    public final TableField<SysFunctionoperationRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.moduleId</code>.
     */
    public final TableField<SysFunctionoperationRecord, String> MODULEID = createField("moduleId", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.funName</code>.
     */
    public final TableField<SysFunctionoperationRecord, String> FUNNAME = createField("funName", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.funParentId</code>.
     */
    public final TableField<SysFunctionoperationRecord, String> FUNPARENTID = createField("funParentId", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.funCode</code>.
     */
    public final TableField<SysFunctionoperationRecord, String> FUNCODE = createField("funCode", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.interceptPrefix</code>.
     */
    public final TableField<SysFunctionoperationRecord, String> INTERCEPTPREFIX = createField("interceptPrefix", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.status</code>.
     */
    public final TableField<SysFunctionoperationRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.sort</code>.
     */
    public final TableField<SysFunctionoperationRecord, Byte> SORT = createField("sort", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.creator</code>.
     */
    public final TableField<SysFunctionoperationRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.modifier</code>.
     */
    public final TableField<SysFunctionoperationRecord, String> MODIFIER = createField("modifier", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.createDate</code>.
     */
    public final TableField<SysFunctionoperationRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.modifyDate</code>.
     */
    public final TableField<SysFunctionoperationRecord, Timestamp> MODIFYDATE = createField("modifyDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>spring_boot.sys_functionoperation.remark</code>.
     */
    public final TableField<SysFunctionoperationRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>spring_boot.sys_functionoperation</code> table reference
     */
    public SysFunctionoperation() {
        this("sys_functionoperation", null);
    }

    /**
     * Create an aliased <code>spring_boot.sys_functionoperation</code> table reference
     */
    public SysFunctionoperation(String alias) {
        this(alias, SYS_FUNCTIONOPERATION);
    }

    private SysFunctionoperation(String alias, Table<SysFunctionoperationRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysFunctionoperation(String alias, Table<SysFunctionoperationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "功能操作表");
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
    public UniqueKey<SysFunctionoperationRecord> getPrimaryKey() {
        return Keys.KEY_SYS_FUNCTIONOPERATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysFunctionoperationRecord>> getKeys() {
        return Arrays.<UniqueKey<SysFunctionoperationRecord>>asList(Keys.KEY_SYS_FUNCTIONOPERATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysFunctionoperation as(String alias) {
        return new SysFunctionoperation(alias, this);
    }

    /**
     * Rename this table
     */
    public SysFunctionoperation rename(String name) {
        return new SysFunctionoperation(name, null);
    }
}
