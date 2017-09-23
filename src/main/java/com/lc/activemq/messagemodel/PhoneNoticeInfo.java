package com.lc.activemq.messagemodel;

import java.io.Serializable;

public class PhoneNoticeInfo implements Serializable {
    /**
     * 消息标题
     */
    public String noticeTitle;
    /**
     * 消息内容
     */
    public String noticeContent;
    /**
     * 接收者
     */
    public String receiver;
    /**
     * 接收手机号
     */
    public String receiverPhone;

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

}