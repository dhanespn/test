package com.dhanes.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "JPA1",schema="TESTSCHEMA")
public class Jpa1Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	int Id;
	@Column(name = "name")
	String Name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
