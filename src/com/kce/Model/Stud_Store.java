package com.kce.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Stud_Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	@Column(name="stud_name")
	public String stud_name;
	@Column(name="stud_dob")
	public String stud_dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_dob() {
		return stud_dob;
	}
	public void setStud_dob(String stud_dob) {
		this.stud_dob = stud_dob;
	}
	public Stud_Store(String stud_name, String stud_dob) {
		this.stud_name = stud_name;
		this.stud_dob = stud_dob;
	}
	public Stud_Store() {
	}
	
}
