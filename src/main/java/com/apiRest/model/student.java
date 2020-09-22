package com.apiRest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	private Integer rut;
	
	@Column
	private String name;
	
	@Column
	private String lastName;
	
	@Column
	private Integer age;
}
