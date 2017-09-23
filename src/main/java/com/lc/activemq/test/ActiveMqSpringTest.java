package com.lc.activemq.test;

import com.lc.activemq.messagemodel.PhoneNoticeInfo;
import com.lc.activemq.service.NotifyMessageConverter;
import com.lc.activemq.service.QueueMessageListener;
import com.lc.activemq.service.QueueMessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/lc/activemq/ActiveMQ-Sping.xml")
public class ActiveMqSpringTest {

    @Autowired
    QueueMessageProducer producer;
    @Autowired
    QueueMessageListener listener;
    @Autowired
    NotifyMessageConverter messageConverter;
    @Autowired
    DefaultMessageListenerContainer container;

    @Test
    public void TestSpringActiveMqProducer() {
        PhoneNoticeInfo noticeInfo = new PhoneNoticeInfo();
        noticeInfo.setNoticeContent("Hello Word");
        noticeInfo.setNoticeTitle("hello Word");
        noticeInfo.setReceiver("hello");
        noticeInfo.setReceiverPhone("1111111");
        producer.sendQueue(noticeInfo);
    }

    @Test
    public void TestSpringActiveMqReceiver() throws Exception{
        container.start();
        Thread.sleep(100000);
    }

}
