package com.apiRest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiRest.dao.StudentDAO;
import com.apiRest.model.student;

@RestController
@RequestMapping("student")
public class studentRest {
	@Autowired
	private StudentDAO studentDAO;
	
	@PostMapping("/guardar")
	private void guardar(@RequestBody student student) {
		studentDAO.save(student);
	}
}
