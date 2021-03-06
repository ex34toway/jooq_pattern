/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables;


import com.nanhu.model.sys.SpringBoot;
import com.nanhu.model.sys.tables.records.SysPermissionMenuRecord;

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
public class SysPermissionMenu extends TableImpl<SysPermissionMenuRecord> {

    private static final long serialVersionUID = -1295527390;

    /**
     * The reference instance of <code>spring_boot.sys_permission_menu</code>
     */
    public static final SysPermissionMenu SYS_PERMISSION_MENU = new SysPermissionMenu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysPermissionMenuRecord> getRecordType() {
        return SysPermissionMenuRecord.class;
    }

    /**
     * The column <code>spring_boot.sys_permission_menu.menuId</code>. 菜单ID
     */
    public final TableField<SysPermissionMenuRecord, String> MENUID = createField("menuId", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "菜单ID");

    /**
     * The column <code>spring_boot.sys_permission_menu.resourcesId</code>. 资源ID
     */
    public final TableField<SysPermissionMenuRecord, String> RESOURCESID = createField("resourcesId", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "资源ID");

    /**
     * Create a <code>spring_boot.sys_permission_menu</code> table reference
     */
    public SysPermissionMenu() {
        this("sys_permission_menu", null);
    }

    /**
     * Create an aliased <code>spring_boot.sys_permission_menu</code> table reference
     */
    public SysPermissionMenu(String alias) {
        this(alias, SYS_PERMISSION_MENU);
    }

    private SysPermissionMenu(String alias, Table<SysPermissionMenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysPermissionMenu(String alias, Table<SysPermissionMenuRecord> aliased, Field<?>[] parameters) {
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
    public SysPermissionMenu as(String alias) {
        return new SysPermissionMenu(alias, this);
    }

    /**
     * Rename this table
     */
    public SysPermissionMenu rename(String name) {
        return new SysPermissionMenu(name, null);
    }
}
