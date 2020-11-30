package model;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Ava implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
