package com.nanhu.model.DTO.story;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liliang on 2016/11/1.
 */
public class StoryVo implements Serializable{
    //id
    private String Id;
    //plot
    private String plot;
    //writer
    private String writer;
    //upvote
    private Integer upvotes;
    //createdBy
    private String createdBy;
    //updatedBy
    private String updatedBy;
    //createdDate
    private Date createdDate;
    //updatedDate
    private Date updatedDate;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
