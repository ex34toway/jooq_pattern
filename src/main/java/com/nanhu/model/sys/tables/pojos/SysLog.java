/**
 * This class is generated by jOOQ
 */
package com.nanhu.model.sys.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 操作日志表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1063994971;

    private String    id;
    private String    operationname;
    private String    operationcontent;
    private String    operationuser;
    private Timestamp operationdate;

    public SysLog() {}

    public SysLog(SysLog value) {
        this.id = value.id;
        this.operationname = value.operationname;
        this.operationcontent = value.operationcontent;
        this.operationuser = value.operationuser;
        this.operationdate = value.operationdate;
    }

    public SysLog(
        String    id,
        String    operationname,
        String    operationcontent,
        String    operationuser,
        Timestamp operationdate
    ) {
        this.id = id;
        this.operationname = operationname;
        this.operationcontent = operationcontent;
        this.operationuser = operationuser;
        this.operationdate = operationdate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperationname() {
        return this.operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname;
    }

    public String getOperationcontent() {
        return this.operationcontent;
    }

    public void setOperationcontent(String operationcontent) {
        this.operationcontent = operationcontent;
    }

    public String getOperationuser() {
        return this.operationuser;
    }

    public void setOperationuser(String operationuser) {
        this.operationuser = operationuser;
    }

    public Timestamp getOperationdate() {
        return this.operationdate;
    }

    public void setOperationdate(Timestamp operationdate) {
        this.operationdate = operationdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysLog (");

        sb.append(id);
        sb.append(", ").append(operationname);
        sb.append(", ").append(operationcontent);
        sb.append(", ").append(operationuser);
        sb.append(", ").append(operationdate);

        sb.append(")");
        return sb.toString();
    }
}
