package com.json.parser;

public class Student {

  private Student Name,Addres,Rollnum();
  private Student() {
	  
  }
public Student(String name, String addres, String rollnum) {
	super();
	this.Name = name;
	this.Addres = addres;
	this.Rollnum = rollnum;
}
public Student getName() {
	return Name;
}
public void setName(Student name) {
	Name = name;
}
public Student getAddres() {
	return Addres;
}
public void setAddres(Student addres) {
	Addres = addres;
}
public Student getRollnum() {
	return Rollnum;
}
public void setRollnum(Student rollnum) {
	Rollnum = rollnum;
}
  
}