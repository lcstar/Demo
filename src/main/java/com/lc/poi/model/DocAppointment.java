package com.lc.poi.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DocAppointment {
    private Integer id;

    private String docId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date appointTimeStart;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date appointTimeEnd;

    private Integer appointmentNum;

    private Integer alreadyNum;

    private Date createTime;

    private Boolean delflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId == null ? null : docId.trim();
    }

    public Date getAppointTimeStart() {
        return appointTimeStart;
    }

    public void setAppointTimeStart(Date appointTimeStart) {
        this.appointTimeStart = appointTimeStart;
    }

    public Date getAppointTimeEnd() {
        return appointTimeEnd;
    }

    public void setAppointTimeEnd(Date appointTimeEnd) {
        this.appointTimeEnd = appointTimeEnd;
    }

    public Integer getAppointmentNum() {
        return appointmentNum;
    }

    public void setAppointmentNum(Integer appointmentNum) {
        this.appointmentNum = appointmentNum;
    }

    public Integer getAlreadyNum() {
        return alreadyNum;
    }

    public void setAlreadyNum(Integer alreadyNum) {
        this.alreadyNum = alreadyNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getDelflag() {
        return delflag;
    }

    public void setDelflag(Boolean delflag) {
        this.delflag = delflag;
    }

    @Override
    public String toString() {
        return "DocAppointment [id=" + id + ", docId=" + docId
                + ", appointTimeStart=" + appointTimeStart
                + ", appointTimeEnd=" + appointTimeEnd + ", appointmentNum="
                + appointmentNum + ", alreadyNum=" + alreadyNum
                + ", createTime=" + createTime + ", delflag=" + delflag + "]";
    }


}