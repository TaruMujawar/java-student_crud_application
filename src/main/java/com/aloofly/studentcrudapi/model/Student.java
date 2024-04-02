package com.aloofly.studentcrudapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="student")
@Data
public class Student {

	@Id
	@Column(name="rollNumber")
	private int rollNumber;
	
	private String name;
	
	private String city;
	
	private String contactNumber;
	
}
