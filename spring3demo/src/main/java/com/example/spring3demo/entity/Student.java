package com.example.spring3demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="myid")
	private int id;
	@Column(name="myname", length=20)
	private String name;
	@Column(name="myemail", length=25, unique=true)
	@NotNull
	private String email;
	

	

}
