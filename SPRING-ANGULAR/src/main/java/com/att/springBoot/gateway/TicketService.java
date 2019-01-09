package com.att.springBoot.gateway;

import org.springframework.integration.annotation.Gateway;

import com.att.springBoot.types.TicketRequest;
import com.att.springBoot.types.TicketResponse;




public interface TicketService {

	/**
	 * Entry to the messaging system. All invocations to this method will be intercepted and sent to the SI "system entry" gateway
	 * 
	 * @param request
	 */
	@Gateway
	public TicketResponse invoke(TicketRequest request);
}
