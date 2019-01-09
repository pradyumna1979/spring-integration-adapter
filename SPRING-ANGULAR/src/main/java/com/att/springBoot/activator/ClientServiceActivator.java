package com.att.springBoot.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.integration.endpoint.AbstractEndpoint;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandlingException;
import org.springframework.stereotype.Component;

import com.att.springBoot.registry.TicketRegistry;
import com.att.springBoot.types.TicketResponse;




@Component("clientServiceActivator")
public class ClientServiceActivator {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	private TicketRegistry registry;
	
	private Message<?> message;


	
	
	/**
	 * Retries the failed invocation. Sends the request message to the outbound service gateway
	 * @return
	 */
	public Message<?> retryInvocation() {
		logger.info("Retrying service invocation...");

		return message;
	}

}