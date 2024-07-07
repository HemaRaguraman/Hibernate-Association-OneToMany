package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Answer")
public class Answers {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String answername;
	private String postby;
	public Answers() {
		super();
	}
	public Answers(int id, String answername, String postby) {
		super();
		this.id = id;
		this.answername = answername;
		this.postby = postby;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	public String getPostby() {
		return postby;
	}
	public void setPostby(String postby) {
		this.postby = postby;
	}
	

}
