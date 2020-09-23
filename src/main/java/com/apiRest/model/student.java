package com.apiRest.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class student {
	@Id
	private Integer rut;
	
	@Column(length = 15)
	private String name;
	
	@Column
	private Integer age;
	
	@Column(length = 15)
	private String lname;
	
	@Column
	private Integer verificrut;

	@ManyToMany
	@JoinTable(name="student_courses"
		,joinColumns = @JoinColumn(name="student_rut")
		,inverseJoinColumns = @JoinColumn(name="course_code")
	)
	
	private Set<course> cursos;

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getVerificrut() {
		return verificrut;
	}

	public void setVerificrut(Integer verificrut) {
		this.verificrut = verificrut;
	}

	public Set<course> getCursos() {
		return cursos;
	}

	public void setCursos(Set<course> cursos) {
		this.cursos = cursos;
	}
	
	
}
