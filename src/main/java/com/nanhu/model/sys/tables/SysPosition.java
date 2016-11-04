/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables;


import com.nanhu.model.sys.Keys;
import com.nanhu.model.sys.SpringBoot;
import com.nanhu.model.sys.tables.records.SysPositionRecord;

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
public class SysPosition extends TableImpl<SysPositionRecord> {

    private static final long serialVersionUID = 1552126425;

    /**
     * The reference instance of <code>spring_boot.sys_position</code>
     */
    public static final SysPosition SYS_POSITION = new SysPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysPositionRecord> getRecordType() {
        return SysPositionRecord.class;
    }

    /**
     * The column <code>spring_boot.sys_position.id</code>. 职位ID
     */
    public final TableField<SysPositionRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "职位ID");

    /**
     * The column <code>spring_boot.sys_position.positionName</code>. 职位名称
     */
    public final TableField<SysPositionRecord, String> POSITIONNAME = createField("positionName", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "职位名称");

    /**
     * The column <code>spring_boot.sys_position.positionCode</code>. 职位编码
     */
    public final TableField<SysPositionRecord, String> POSITIONCODE = createField("positionCode", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "职位编码");

    /**
     * The column <code>spring_boot.sys_position.positionParentId</code>. 职位父节点Id
     */
    public final TableField<SysPositionRecord, String> POSITIONPARENTID = createField("positionParentId", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "职位父节点Id");

    /**
     * The column <code>spring_boot.sys_position.status</code>. 状态(99：删除,10：启用 ,20：禁用)
     */
    public final TableField<SysPositionRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "状态(99：删除,10：启用 ,20：禁用)");

    /**
     * The column <code>spring_boot.sys_position.sort</code>.
     */
    public final TableField<SysPositionRecord, Byte> SORT = createField("sort", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>spring_boot.sys_position.creator</code>.
     */
    public final TableField<SysPositionRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_position.modifier</code>.
     */
    public final TableField<SysPositionRecord, String> MODIFIER = createField("modifier", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>spring_boot.sys_position.createDate</code>. 创建时间
     */
    public final TableField<SysPositionRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>spring_boot.sys_position.modifyDate</code>. 修改时间
     */
    public final TableField<SysPositionRecord, Timestamp> MODIFYDATE = createField("modifyDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>spring_boot.sys_position.remark</code>. 备注
     */
    public final TableField<SysPositionRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "备注");

    /**
     * Create a <code>spring_boot.sys_position</code> table reference
     */
    public SysPosition() {
        this("sys_position", null);
    }

    /**
     * Create an aliased <code>spring_boot.sys_position</code> table reference
     */
    public SysPosition(String alias) {
        this(alias, SYS_POSITION);
    }

    private SysPosition(String alias, Table<SysPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysPosition(String alias, Table<SysPositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "职位");
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
    public UniqueKey<SysPositionRecord> getPrimaryKey() {
        return Keys.KEY_SYS_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<SysPositionRecord>>asList(Keys.KEY_SYS_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysPosition as(String alias) {
        return new SysPosition(alias, this);
    }

    /**
     * Rename this table
     */
    public SysPosition rename(String name) {
        return new SysPosition(name, null);
    }
}