/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys;


import com.nanhu.model.sys.tables.SysDepartment;
import com.nanhu.model.sys.tables.SysFunctionoperation;
import com.nanhu.model.sys.tables.SysGroup;
import com.nanhu.model.sys.tables.SysLog;
import com.nanhu.model.sys.tables.SysLoginLog;
import com.nanhu.model.sys.tables.SysLoginUser;
import com.nanhu.model.sys.tables.SysMember;
import com.nanhu.model.sys.tables.SysMenu;
import com.nanhu.model.sys.tables.SysMenuCopy;
import com.nanhu.model.sys.tables.SysOrgDepartmentPosition;
import com.nanhu.model.sys.tables.SysOrgPosition;
import com.nanhu.model.sys.tables.SysOrganization;
import com.nanhu.model.sys.tables.SysPermissionFunoperation;
import com.nanhu.model.sys.tables.SysPermissionGroup;
import com.nanhu.model.sys.tables.SysPermissionMenu;
import com.nanhu.model.sys.tables.SysPermissionRole;
import com.nanhu.model.sys.tables.SysPermissionUser;
import com.nanhu.model.sys.tables.SysPosition;
import com.nanhu.model.sys.tables.SysResources;
import com.nanhu.model.sys.tables.SysRole;
import com.nanhu.model.sys.tables.SysSubsystem;
import com.nanhu.model.sys.tables.SysSubsystemModule;
import com.nanhu.model.sys.tables.SysUserGroup;
import com.nanhu.model.sys.tables.SysUsergroupRole;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in spring_boot
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 部门
     */
    public static final SysDepartment SYS_DEPARTMENT = com.nanhu.model.sys.tables.SysDepartment.SYS_DEPARTMENT;

    /**
     * 功能操作表
     */
    public static final SysFunctionoperation SYS_FUNCTIONOPERATION = com.nanhu.model.sys.tables.SysFunctionoperation.SYS_FUNCTIONOPERATION;

    /**
     * 组
     */
    public static final SysGroup SYS_GROUP = com.nanhu.model.sys.tables.SysGroup.SYS_GROUP;

    /**
     * 操作日志表
     */
    public static final SysLog SYS_LOG = com.nanhu.model.sys.tables.SysLog.SYS_LOG;

    /**
     * 用户登录日志
     */
    public static final SysLoginLog SYS_LOGIN_LOG = com.nanhu.model.sys.tables.SysLoginLog.SYS_LOGIN_LOG;

    /**
     * The table <code>spring_boot.sys_login_user</code>.
     */
    public static final SysLoginUser SYS_LOGIN_USER = com.nanhu.model.sys.tables.SysLoginUser.SYS_LOGIN_USER;

    /**
     * 组织成员关系表
     */
    public static final SysMember SYS_MEMBER = com.nanhu.model.sys.tables.SysMember.SYS_MEMBER;

    /**
     * The table <code>spring_boot.sys_menu</code>.
     */
    public static final SysMenu SYS_MENU = com.nanhu.model.sys.tables.SysMenu.SYS_MENU;

    /**
     * The table <code>spring_boot.sys_menu_copy</code>.
     */
    public static final SysMenuCopy SYS_MENU_COPY = com.nanhu.model.sys.tables.SysMenuCopy.SYS_MENU_COPY;

    /**
     * The table <code>spring_boot.sys_organization</code>.
     */
    public static final SysOrganization SYS_ORGANIZATION = com.nanhu.model.sys.tables.SysOrganization.SYS_ORGANIZATION;

    /**
     * 组织部门与组织岗位
     */
    public static final SysOrgDepartmentPosition SYS_ORG_DEPARTMENT_POSITION = com.nanhu.model.sys.tables.SysOrgDepartmentPosition.SYS_ORG_DEPARTMENT_POSITION;

    /**
     * 组织与职位
     */
    public static final SysOrgPosition SYS_ORG_POSITION = com.nanhu.model.sys.tables.SysOrgPosition.SYS_ORG_POSITION;

    /**
     * 权限操作关联表
     */
    public static final SysPermissionFunoperation SYS_PERMISSION_FUNOPERATION = com.nanhu.model.sys.tables.SysPermissionFunoperation.SYS_PERMISSION_FUNOPERATION;

    /**
     * 组权限表
     */
    public static final SysPermissionGroup SYS_PERMISSION_GROUP = com.nanhu.model.sys.tables.SysPermissionGroup.SYS_PERMISSION_GROUP;

    /**
     * The table <code>spring_boot.sys_permission_menu</code>.
     */
    public static final SysPermissionMenu SYS_PERMISSION_MENU = com.nanhu.model.sys.tables.SysPermissionMenu.SYS_PERMISSION_MENU;

    /**
     * The table <code>spring_boot.sys_permission_role</code>.
     */
    public static final SysPermissionRole SYS_PERMISSION_ROLE = com.nanhu.model.sys.tables.SysPermissionRole.SYS_PERMISSION_ROLE;

    /**
     * 权限用户关联表
     */
    public static final SysPermissionUser SYS_PERMISSION_USER = com.nanhu.model.sys.tables.SysPermissionUser.SYS_PERMISSION_USER;

    /**
     * 职位
     */
    public static final SysPosition SYS_POSITION = com.nanhu.model.sys.tables.SysPosition.SYS_POSITION;

    /**
     * 资源表
     */
    public static final SysResources SYS_RESOURCES = com.nanhu.model.sys.tables.SysResources.SYS_RESOURCES;

    /**
     * The table <code>spring_boot.sys_role</code>.
     */
    public static final SysRole SYS_ROLE = com.nanhu.model.sys.tables.SysRole.SYS_ROLE;

    /**
     * 子系统
     */
    public static final SysSubsystem SYS_SUBSYSTEM = com.nanhu.model.sys.tables.SysSubsystem.SYS_SUBSYSTEM;

    /**
     * 子系统模块
     */
    public static final SysSubsystemModule SYS_SUBSYSTEM_MODULE = com.nanhu.model.sys.tables.SysSubsystemModule.SYS_SUBSYSTEM_MODULE;

    /**
     * 用户组与角色关系表
     */
    public static final SysUsergroupRole SYS_USERGROUP_ROLE = com.nanhu.model.sys.tables.SysUsergroupRole.SYS_USERGROUP_ROLE;

    /**
     * 用户与用户组关系表
     */
    public static final SysUserGroup SYS_USER_GROUP = com.nanhu.model.sys.tables.SysUserGroup.SYS_USER_GROUP;
}
