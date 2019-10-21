package com.training.model;

public class Students {
 private int studentRoll_No;
 private String studentName;
 private String sutdentCourse;
 private int studentAge;
 private String studentHobbi;
public Students() {
	super();
}
public Students(int studentRoll_No, String studentName, String sutdentCourse, int studentAge, String studentHobbi) {
	super();
	this.studentRoll_No = studentRoll_No;
	this.studentName = studentName;
	this.sutdentCourse = sutdentCourse;
	this.studentAge = studentAge;
	this.studentHobbi = studentHobbi;
}
public int getStudentRoll_No() {
	return studentRoll_No;
}
public void setStudentRoll_No(int studentRoll_No) {
	this.studentRoll_No = studentRoll_No;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getSutdentCourse() {
	return sutdentCourse;
}
public void setSutdentCourse(String sutdentCourse) {
	this.sutdentCourse = sutdentCourse;
}
public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
public String getStudentHobbi() {
	return studentHobbi;
}
public void setStudentHobbi(String studentHobbi) {
	this.studentHobbi = studentHobbi;
}
@Override
public String toString() {
	return "Students [studentRoll_No=" + studentRoll_No + ", studentName=" + studentName + ", sutdentCourse="
			+ sutdentCourse + ", studentAge=" + studentAge + ", studentHobbi=" + studentHobbi + "]";
}
 
 
}
