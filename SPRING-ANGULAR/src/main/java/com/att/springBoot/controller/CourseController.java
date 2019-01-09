/**
 * 
 */
package com.att.springBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.att.springBoot.model.Course;
import com.att.springBoot.model.TicketRequestOne;
import com.att.springBoot.types.GetStudentDetailsRequest;
import com.att.springBoot.types.GetStudentDetailsResponse;
import com.att.springBoot.types.StudentDetails;



/**
 * @author pradyumna
 *
 */

@RestController
@RequestMapping("/api")
public class CourseController {
	@Autowired
	private com.att.springBoot.gateway.TicketService service;
	
	
	@PostMapping("/TicketRequest")
	public GetStudentDetailsResponse createStudent(@RequestBody GetStudentDetailsRequest ticketRequest) {

		System.out.println(ticketRequest);
		GetStudentDetailsResponse response = service.invoke(ticketRequest);
		return response;
		//response.getFilmId();
		//return ResponseEntity.ok().build();

	}
	

}
