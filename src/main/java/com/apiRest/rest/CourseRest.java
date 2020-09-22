package com.apiRest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiRest.dao.CourseDAO;
import com.apiRest.model.course;

@RestController
@RequestMapping("course")
public class CourseRest {
	
	@Autowired
	private CourseDAO courseDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody course course) {
		courseDAO.save(course);
	}
}
