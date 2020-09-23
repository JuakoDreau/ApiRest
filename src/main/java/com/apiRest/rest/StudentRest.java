package com.apiRest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiRest.dao.StudentDAO;
import com.apiRest.model.course;
import com.apiRest.model.student;

@RestController
@RequestMapping("student")
public class StudentRest {
	@Autowired
	private StudentDAO studentDAO;
	
	@PostMapping("/POST")
	private void guardar(@RequestBody student student) {
		studentDAO.save(student);
	}
	
	@GetMapping("/GET/all")
	public List<student> listar(){
		return studentDAO.findAll();
	}
	
	@DeleteMapping("/DELETE/{id}")
	public void elimiar(@PathVariable("id")Integer id) {
		studentDAO.deleteById(id);
	}
	
	@PutMapping("/PUT")
	private void actualizar(@RequestBody student student) {
		studentDAO.save(student);
	}
}
