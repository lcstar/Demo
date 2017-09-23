package com.lc.activemq.service;

import com.lc.activemq.messagemodel.PhoneNoticeInfo;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.core.JmsTemplate;


public class TopicMessageProducer {
    private JmsTemplate jmsTemplate;
    private ActiveMQTopic notifyTopic;
    private NotifyMessageConverter messageConverter;
    public void sendQueue(PhoneNoticeInfo noticeInfo){
        sendMessage(noticeInfo);
    }
    private void sendMessage(PhoneNoticeInfo noticeInfo) {
// TODO Auto-generated method stub
        jmsTemplate.setMessageConverter(messageConverter);
        jmsTemplate.setPubSubDomain(false);
        jmsTemplate.convertAndSend(notifyTopic,noticeInfo);
    }
    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public NotifyMessageConverter getMessageConverter() {
        return messageConverter;
    }
    public void setMessageConverter(NotifyMessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }

    public ActiveMQTopic getNotifyTopic() {
        return notifyTopic;
    }

    public void setNotifyTopic(ActiveMQTopic notifyTopic) {
        this.notifyTopic = notifyTopic;
    }
}
