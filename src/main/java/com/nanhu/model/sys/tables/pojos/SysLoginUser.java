/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class SysLoginUser implements Serializable {

    private static final long serialVersionUID = 2084057980;

    private String    id;
    private String    groupid;
    private String    loginname;
    private String    password;
    private String    username;
    private String    mobile;
    private String    email;
    private String    salt;
    private Byte      status;
    private Byte      sort;
    private String    creator;
    private String    modifier;
    private Timestamp createdate;
    private Timestamp modifydate;
    private String    remark;

    public SysLoginUser() {}

    public SysLoginUser(SysLoginUser value) {
        this.id = value.id;
        this.groupid = value.groupid;
        this.loginname = value.loginname;
        this.password = value.password;
        this.username = value.username;
        this.mobile = value.mobile;
        this.email = value.email;
        this.salt = value.salt;
        this.status = value.status;
        this.sort = value.sort;
        this.creator = value.creator;
        this.modifier = value.modifier;
        this.createdate = value.createdate;
        this.modifydate = value.modifydate;
        this.remark = value.remark;
    }

    public SysLoginUser(
        String    id,
        String    groupid,
        String    loginname,
        String    password,
        String    username,
        String    mobile,
        String    email,
        String    salt,
        Byte      status,
        Byte      sort,
        String    creator,
        String    modifier,
        Timestamp createdate,
        Timestamp modifydate,
        String    remark
    ) {
        this.id = id;
        this.groupid = groupid;
        this.loginname = loginname;
        this.password = password;
        this.username = username;
        this.mobile = mobile;
        this.email = email;
        this.salt = salt;
        this.status = status;
        this.sort = sort;
        this.creator = creator;
        this.modifier = modifier;
        this.createdate = createdate;
        this.modifydate = modifydate;
        this.remark = remark;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupid() {
        return this.groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getLoginname() {
        return this.loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt() {
        return this.salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getSort() {
        return this.sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return this.modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public Timestamp getModifydate() {
        return this.modifydate;
    }

    public void setModifydate(Timestamp modifydate) {
        this.modifydate = modifydate;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysLoginUser (");

        sb.append(id);
        sb.append(", ").append(groupid);
        sb.append(", ").append(loginname);
        sb.append(", ").append(password);
        sb.append(", ").append(username);
        sb.append(", ").append(mobile);
        sb.append(", ").append(email);
        sb.append(", ").append(salt);
        sb.append(", ").append(status);
        sb.append(", ").append(sort);
        sb.append(", ").append(creator);
        sb.append(", ").append(modifier);
        sb.append(", ").append(createdate);
        sb.append(", ").append(modifydate);
        sb.append(", ").append(remark);

        sb.append(")");
        return sb.toString();
    }
}