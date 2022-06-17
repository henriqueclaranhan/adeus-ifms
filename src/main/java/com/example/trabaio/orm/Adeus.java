package com.example.trabaio.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adeus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	public Adeus() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
