package com.apiRest.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping("/POST")
	public void guardar(@RequestBody course course) {
		courseDAO.save(course);
	}
	
//	@GetMapping("/GET/all")
//	public List<course> listar(){
//		return courseDAO.findAll();
//	}
	
	@GetMapping("/GET/all")
	public List<course> listar(){
		return courseDAO.findAll();
	}
	
	@GetMapping("/GET/{id}")
	public Optional<course> listarById(@PathVariable("id") Integer id){
		return courseDAO.findById(id);
	}
	
	@DeleteMapping("/DELETE/{id}")
	public void elimiar(@PathVariable("id")Integer id) {
		courseDAO.deleteById(id);
	}
	
	@PutMapping("/PUT")
	private void actualizar(@RequestBody course course) {
		courseDAO.save(course);
	}
}
