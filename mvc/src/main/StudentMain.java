package main;

import controller.StudentController;
import model.Student;
import view.StudentView;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		Student student =new Student();

	      //Create a view : to write student details on console
	      StudentView studentView = new StudentView();
		StudentController controller = new StudentController(student,studentView);
		
		controller.setStudentName("Roshan");
		controller.setAge(30);
		
		System.out.println("test");
		
		controller.updateView();

	}

}
