/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 11/10/2017

*/

// Importing libraries
import java.io.*;
import java.util.*;
import java.text.*;

/*
	
	App Description

*/

public class Practica{

	public static void main(String[] args) {

		Student newStudent = new Student();

		String testStudentFirstName = "Francisco";

		newStudent.setStudentFirstName(testStudentFirstName);

		String printTest = newStudent.getStudentFirstName();

		System.out.println(printTest);


		char testStudentGender = 'F';

		newStudent.setStudentGender(testStudentGender);

		char printTest2 = newStudent.getStudentGender();

		System.out.println(printTest2);

	}

}