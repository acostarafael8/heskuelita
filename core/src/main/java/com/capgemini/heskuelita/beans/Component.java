package com.capgemini.heskuelita.beans;

public abstract class Component {

	private Long id;
	
	public Component() {
		super();
	}
	
	public Component(Long id) {
		this.id= id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}