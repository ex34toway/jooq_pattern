/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 组权限表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysPermissionGroup implements Serializable {

    private static final long serialVersionUID = 1933835427;

    private String groupid;
    private String resourcesid;

    public SysPermissionGroup() {}

    public SysPermissionGroup(SysPermissionGroup value) {
        this.groupid = value.groupid;
        this.resourcesid = value.resourcesid;
    }

    public SysPermissionGroup(
        String groupid,
        String resourcesid
    ) {
        this.groupid = groupid;
        this.resourcesid = resourcesid;
    }

    public String getGroupid() {
        return this.groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getResourcesid() {
        return this.resourcesid;
    }

    public void setResourcesid(String resourcesid) {
        this.resourcesid = resourcesid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysPermissionGroup (");

        sb.append(groupid);
        sb.append(", ").append(resourcesid);

        sb.append(")");
        return sb.toString();
    }
}