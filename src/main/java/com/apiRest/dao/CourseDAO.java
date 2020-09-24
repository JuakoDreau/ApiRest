package com.apiRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiRest.model.course;

public interface CourseDAO extends JpaRepository<course, Integer>{
	
}
