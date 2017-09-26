package com.stl.touristapp.config;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;

public class SampleJmsMessageListner implements MessageListener {

    private JmsTemplate jmsTemplate;
    private Queue queue;

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            try {
                String msg = ((TextMessage) message).getText();
                System.out.println("Received message: " + msg);
            } catch (JMSException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

//    public Employee receiveMessage() throws JMSException {
//        Map map = (Map) this.jmsTemplate.receiveAndConvert();
//        return new Employee((String) map.get("name"), (Integer) map.get("age"));
//    }
}
