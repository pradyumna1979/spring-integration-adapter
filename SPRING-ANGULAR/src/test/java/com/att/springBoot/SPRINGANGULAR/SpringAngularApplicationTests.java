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
import com.att.springBoot.types.TicketRequest;
import com.att.springBoot.types.TicketResponse;
import com.att.springBoot.utils.DateUtils;


@ContextConfiguration("classpath:int-ws-config.xml")
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAngularApplicationTests {

	@Autowired
	private TicketService service;
	
	@Test
	public void testInvocation() throws InterruptedException, ExecutionException {
		TicketRequest request = new TicketRequest();
		request.setFilmId("aFilm");
		request.setQuantity(new BigInteger("3"));
		request.setSessionDate(DateUtils.convertDate(new Date()));
		
		TicketResponse response = service.invoke(request);
		
		assertNotNull(response);
		assertEquals("aFilm", response.getFilmId());
		assertEquals(new BigInteger("5"), response.getQuantity());
	}
}
