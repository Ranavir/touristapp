package com.stl.touristapp.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.connection.SingleConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
//@Configuration
//@EnableJms
public class JmsConfig {
//	@Value("${spring.activemq.broker-url}")
//	String BROKER_URL ; 
//	@Value("${spring.activemq.user}")
//	String BROKER_USERNAME ; 
//	@Value("${spring.activemq.password}")
//	String BROKER_PASSWORD ;
//	@Value("${jms.queue.destination}")
//	String destinationQueue;
//	
//	@Bean
//	public SingleConnectionFactory connectionFactory(){
//	    ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//	    connectionFactory.setBrokerURL(BROKER_URL);
//	    connectionFactory.setPassword(BROKER_USERNAME);
//	    connectionFactory.setUserName(BROKER_PASSWORD);
//	    return new SingleConnectionFactory(connectionFactory);
//	}
//
//	@Bean
//	public JmsTemplate jmsTemplate(){
//	    JmsTemplate template = new JmsTemplate();
//	    template.setConnectionFactory(connectionFactory());
//	    return template;
//	}
//	@Bean
//	public SampleJmsMessageConverter sampleMessageConverter(){
//		SampleJmsMessageConverter converter = new SampleJmsMessageConverter();
//	    return converter;
//	}
//	@Bean
//	public ActiveMQQueue activeMQQueue(){
//		ActiveMQQueue queue = new ActiveMQQueue(destinationQueue);
//	    return queue;
//	}
//	@Bean
//	public SampleJmsMessageListner sampleJmsMessageListner(){
//		SampleJmsMessageListner msgListner = new SampleJmsMessageListner();
//		msgListner.setJmsTemplate(jmsTemplate());
//		msgListner.setQueue(activeMQQueue());
//	    return msgListner;
//	}
//	@Bean
//	public SampleJmsMessageSender sampleJmsMessageSender(){
//		SampleJmsMessageSender msgSender = new SampleJmsMessageSender();
//		msgSender.setJmsTemplate(jmsTemplate());
//		msgSender.setQueue(activeMQQueue());
//	    return msgSender;
//	}
//	@Bean
//	public DefaultMessageListenerContainer jmsContainer(){
//		DefaultMessageListenerContainer jmsContainer = new DefaultMessageListenerContainer();
//		jmsContainer.setConnectionFactory(connectionFactory());
//		jmsContainer.setDestinationName(destinationQueue);
//		jmsContainer.setMessageListener(sampleJmsMessageListner());
//	    return jmsContainer;
//	}

	
}//end class
//@Bean
//public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
//    DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//    factory.setConnectionFactory(connectionFactory());
//    factory.setConcurrency("1-1");
//    return factory;
//}