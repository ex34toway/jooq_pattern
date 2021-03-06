/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户登录日志
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysLoginLog implements Serializable {

    private static final long serialVersionUID = 1357986015;

    private String    id;
    private String    userid;
    private String    loginip;
    private Timestamp logindate;
    private Long      expiretime;
    private String    createby;
    private String    updateby;
    private Timestamp createdate;
    private Timestamp updatedate;

    public SysLoginLog() {}

    public SysLoginLog(SysLoginLog value) {
        this.id = value.id;
        this.userid = value.userid;
        this.loginip = value.loginip;
        this.logindate = value.logindate;
        this.expiretime = value.expiretime;
        this.createby = value.createby;
        this.updateby = value.updateby;
        this.createdate = value.createdate;
        this.updatedate = value.updatedate;
    }

    public SysLoginLog(
        String    id,
        String    userid,
        String    loginip,
        Timestamp logindate,
        Long      expiretime,
        String    createby,
        String    updateby,
        Timestamp createdate,
        Timestamp updatedate
    ) {
        this.id = id;
        this.userid = userid;
        this.loginip = loginip;
        this.logindate = logindate;
        this.expiretime = expiretime;
        this.createby = createby;
        this.updateby = updateby;
        this.createdate = createdate;
        this.updatedate = updatedate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getLoginip() {
        return this.loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public Timestamp getLogindate() {
        return this.logindate;
    }

    public void setLogindate(Timestamp logindate) {
        this.logindate = logindate;
    }

    public Long getExpiretime() {
        return this.expiretime;
    }

    public void setExpiretime(Long expiretime) {
        this.expiretime = expiretime;
    }

    public String getCreateby() {
        return this.createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public String getUpdateby() {
        return this.updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public Timestamp getUpdatedate() {
        return this.updatedate;
    }

    public void setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysLoginLog (");

        sb.append(id);
        sb.append(", ").append(userid);
        sb.append(", ").append(loginip);
        sb.append(", ").append(logindate);
        sb.append(", ").append(expiretime);
        sb.append(", ").append(createby);
        sb.append(", ").append(updateby);
        sb.append(", ").append(createdate);
        sb.append(", ").append(updatedate);

        sb.append(")");
        return sb.toString();
    }
}
