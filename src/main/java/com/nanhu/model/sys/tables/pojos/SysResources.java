/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 资源表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysResources implements Serializable {

    private static final long serialVersionUID = 275173737;

    private String    id;
    private String    resourcesname;
    private Byte      resourcestype;
    private Byte      status;
    private Byte      sort;
    private String    creator;
    private String    modifier;
    private Timestamp createdate;
    private Timestamp modifydate;
    private String    remark;

    public SysResources() {}

    public SysResources(SysResources value) {
        this.id = value.id;
        this.resourcesname = value.resourcesname;
        this.resourcestype = value.resourcestype;
        this.status = value.status;
        this.sort = value.sort;
        this.creator = value.creator;
        this.modifier = value.modifier;
        this.createdate = value.createdate;
        this.modifydate = value.modifydate;
        this.remark = value.remark;
    }

    public SysResources(
        String    id,
        String    resourcesname,
        Byte      resourcestype,
        Byte      status,
        Byte      sort,
        String    creator,
        String    modifier,
        Timestamp createdate,
        Timestamp modifydate,
        String    remark
    ) {
        this.id = id;
        this.resourcesname = resourcesname;
        this.resourcestype = resourcestype;
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

    public String getResourcesname() {
        return this.resourcesname;
    }

    public void setResourcesname(String resourcesname) {
        this.resourcesname = resourcesname;
    }

    public Byte getResourcestype() {
        return this.resourcestype;
    }

    public void setResourcestype(Byte resourcestype) {
        this.resourcestype = resourcestype;
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
        StringBuilder sb = new StringBuilder("SysResources (");

        sb.append(id);
        sb.append(", ").append(resourcesname);
        sb.append(", ").append(resourcestype);
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
