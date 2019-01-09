package com.att.springBoot.gateway;

import org.springframework.integration.annotation.Gateway;

import com.att.springBoot.types.GetStudentDetailsRequest;
import com.att.springBoot.types.GetStudentDetailsResponse;




public interface TicketService {

	/**
	 * Entry to the messaging system. All invocations to this method will be intercepted and sent to the SI "system entry" gateway
	 * 
	 * @param request
	 */
	@Gateway
	public GetStudentDetailsResponse invoke(GetStudentDetailsRequest request);
}
