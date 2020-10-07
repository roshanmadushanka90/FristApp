package controller;

import model.Student;
import view.StudentView;

public class StudentController {
	
	private Student student;
	private StudentView studentView;
	
	public StudentController (Student student,StudentView studentView) {
		this.student =student;
		this.studentView =studentView;
	}
	
	public void setStudentName(String name){
		student.setName(name);		
	   }

	   public String getStudentName(){
	      return student.getName();		
	   }

	   public void setAge(int age){
		   student.setAge(age);		
	   }

	   public int getAge(){
	      return student.getAge();		
	   }
	
	   public void updateView(){				
		   studentView.staDetails(student.getName(), student.getAge());
		   }
}
