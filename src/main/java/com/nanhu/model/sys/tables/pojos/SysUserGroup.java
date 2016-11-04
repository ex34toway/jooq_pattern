/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 用户与用户组关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysUserGroup implements Serializable {

    private static final long serialVersionUID = -126821014;

    private String userid;
    private String groupid;

    public SysUserGroup() {}

    public SysUserGroup(SysUserGroup value) {
        this.userid = value.userid;
        this.groupid = value.groupid;
    }

    public SysUserGroup(
        String userid,
        String groupid
    ) {
        this.userid = userid;
        this.groupid = groupid;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGroupid() {
        return this.groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysUserGroup (");

        sb.append(userid);
        sb.append(", ").append(groupid);

        sb.append(")");
        return sb.toString();
    }
}
