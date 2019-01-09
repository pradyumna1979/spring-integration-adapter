package com.att.springBoot.SPRINGANGULAR;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigInteger;
import java.util.Date;
import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.att.springBoot.gateway.TicketService;
import com.att.springBoot.types.GetStudentDetailsRequest;
import com.att.springBoot.types.GetStudentDetailsResponse;


@ContextConfiguration("classpath:int-ws-config.xml")
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAngularApplicationTests {

	@Autowired
	private TicketService service;
	
	@Test
	public void testInvocation() throws InterruptedException, ExecutionException {
		GetStudentDetailsRequest request = new GetStudentDetailsRequest();
		request.setId(1);
		
		GetStudentDetailsResponse response = service.invoke(request);
		
		assertNotNull(response);
		
	}
}
