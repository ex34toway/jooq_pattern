/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 组织部门与组织岗位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysOrgDepartmentPosition implements Serializable {

    private static final long serialVersionUID = 487488290;

    private String    orgid;
    private String    positionid;
    private String    depid;
    private Byte      status;
    private Byte      sort;
    private String    creator;
    private String    modifier;
    private Timestamp createdate;
    private Timestamp modifydate;
    private String    remark;

    public SysOrgDepartmentPosition() {}

    public SysOrgDepartmentPosition(SysOrgDepartmentPosition value) {
        this.orgid = value.orgid;
        this.positionid = value.positionid;
        this.depid = value.depid;
        this.status = value.status;
        this.sort = value.sort;
        this.creator = value.creator;
        this.modifier = value.modifier;
        this.createdate = value.createdate;
        this.modifydate = value.modifydate;
        this.remark = value.remark;
    }

    public SysOrgDepartmentPosition(
        String    orgid,
        String    positionid,
        String    depid,
        Byte      status,
        Byte      sort,
        String    creator,
        String    modifier,
        Timestamp createdate,
        Timestamp modifydate,
        String    remark
    ) {
        this.orgid = orgid;
        this.positionid = positionid;
        this.depid = depid;
        this.status = status;
        this.sort = sort;
        this.creator = creator;
        this.modifier = modifier;
        this.createdate = createdate;
        this.modifydate = modifydate;
        this.remark = remark;
    }

    public String getOrgid() {
        return this.orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getPositionid() {
        return this.positionid;
    }

    public void setPositionid(String positionid) {
        this.positionid = positionid;
    }

    public String getDepid() {
        return this.depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
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
        StringBuilder sb = new StringBuilder("SysOrgDepartmentPosition (");

        sb.append(orgid);
        sb.append(", ").append(positionid);
        sb.append(", ").append(depid);
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
