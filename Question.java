package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="Question")
public class Question {
@Id
@GeneratedValue
int id;String question;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="qid")
@OrderColumn(name="type")
private List<Answers> answers;


public Question() {
	super();
}


public Question(int id, String question, List<Answers> answers) {
	super();
	this.id = id;
	this.question = question;
	this.answers = answers;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Answers> getAnswers() {
	return answers;
}
public void setAnswers(List<Answers> answers) {
	this.answers = answers;
}


}
