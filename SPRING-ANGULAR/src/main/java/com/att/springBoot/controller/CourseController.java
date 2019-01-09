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
import com.att.springBoot.types.TicketRequest;



/**
 * @author pradyumna
 *
 */

@RestController
@RequestMapping("/api")
public class CourseController {
	@Autowired
	private com.att.springBoot.gateway.TicketService service;
	
	@GetMapping("/courses")
	public List<Course> getAllCustomers() {
		System.out.println("Get all Customers...");
 
		List<Course> courses = new ArrayList<>();
		
		Course course1= new Course();
		course1.setId(1);
		course1.setDescription("Angular for Beginners");
		course1.setIconUrl("https://angular-academy.s3.amazonaws.com/thumbnails/angular2-for-beginners-small-v2.png");
		course1.setCourseListIcon("https://angular-academy.s3.amazonaws.com/main-logo/main-page-logo-small-hat.png");
		course1.setLongDescription("Establish a solid layer of fundamentals, learn what's under the hood of Angular");
		course1.setCategory("ADVANCED");
		course1.setLessonsCount(10);
		
		Course course2= new Course();
		course2.setId(2);
		course2.setDescription("Angular for Beginners");
		course2.setIconUrl("https://angular-academy.s3.amazonaws.com/thumbnails/angular2-for-beginners-small-v2.png");
		course2.setCourseListIcon("https://angular-academy.s3.amazonaws.com/main-logo/main-page-logo-small-hat.png");
		course2.setLongDescription("Establish a solid layer of fundamentals, learn what's under the hood of Angular");
		course2.setCategory("BEGINNER");
		course2.setLessonsCount(20);
	
		
		courses.add(course1);
		courses.add(course2);
		
		return courses;
	}
	
	@PostMapping("/TicketRequest")
	public void createStudent(@RequestBody TicketRequest ticketRequest) {

		System.out.println(ticketRequest);
		com.att.springBoot.types.TicketResponse response = service.invoke(ticketRequest);
		//response.getFilmId();
		//return ResponseEntity.ok().build();

	}
	

}
