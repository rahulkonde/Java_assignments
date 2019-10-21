package com.training.main;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import com.training.model.Students;

public class StudentsMain {
	public static void main(String[] args) {
		
	   List <Students> students = new ArrayList<>();
	students.add(new Students(1,"maheshbabu","java",24,"readingbooks"));
	students.add(new Students(2,"jagapatibabu","oracle",25,"playinggames"));
	students.add(new Students(3,"rambabu","python",26,"batminton"));
	students.add(new Students(4,"nagababu","mongodb",27,"nothing"));
	students.add(new Students(5,"surendrababu","mysql",28,"listeningmusic"));
	{
	
		Predicate<Students> oddLengthStudent=(s)->{
			if(s.getStudentName().length()%2==0)
							return true;
			else
			return false;
			
		};
		students.removeIf(oddLengthStudent);
		students.forEach((s)->System.out.println(s));
	
	

	
}

	
	
	}}