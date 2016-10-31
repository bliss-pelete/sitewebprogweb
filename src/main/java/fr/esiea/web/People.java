package fr.esiea.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="People")
public class People {
	
	
	private int id; 
	
	@Id
	@GeneratedValue
	@Column
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name; 
	

	
	public People() {
		
	}

	public People(String lname) {
		
		this.name = lname; 
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
