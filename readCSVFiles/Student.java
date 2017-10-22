/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 11/10/2017

*/


// Importing libraries
import java.io.*;
// import java.text.SimpleDateFormat;


public class Student {

	/* ATTRIBUTES */
	private String studentFirstName;
	private String studentMiddleName;
	private String studentLastName;
	private int studentAge;
	private char studentGender;
	private String studentAddressStreet1;
	private String studentAddressStreet2;
	private String studentAddressCity;
	private String studentAddressState;
	private int studentAddressZipcode;
	private String studentBirthDate;


	/* INSTANCES */

	// Empty constructor
	public Student() {
		studentFirstName = " ";
		studentMiddleName = " ";
		studentLastName = " ";
		studentAge = 0;
		studentGender = ' ';
		studentAddressStreet1 = " ";
		studentAddressStreet2 = " ";
		studentAddressCity = " ";
		studentAddressState = " ";
		studentAddressZipcode = 0;
	}


	public Student(	String studentFirstName,
					String studentMiddleName,
					String studentLastName,
					int studentAge,
					char studentGender,
					String studentAddressStreet1,
					String studentAddressStreet2,
					String studentAddressCity,
					String studentAddressState,
					int studentAddressZipcode) {
		this.studentFirstName = studentFirstName;
		this.studentMiddleName = studentMiddleName;
		this.studentLastName = studentLastName;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
		this.studentAddressStreet1 = studentAddressStreet1;
		this.studentAddressStreet2 = studentAddressStreet2;
		this.studentAddressCity = studentAddressCity;
		this.studentAddressState = studentAddressState;
		this.studentAddressZipcode = studentAddressZipcode;
	}


	/* METODOS */
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}


	public String getStudentFirstName() {
		return studentFirstName;
	}


	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}


	public String getStudentMiddleName() {
		return studentMiddleName;
	}


	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}


	public String getStudentLastName() {
		return studentLastName;
	}


	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}


	public int getStudentAge() {
		return studentAge;
	}


	public void setStudentGender(char studentGender) {
		this.studentGender = studentGender;
	}


	public char getStudentGender() {
		return studentGender;
	}


	public void setStudentAddressStreet1(String studentAddressStreet1) {
		this.studentAddressStreet1 = studentAddressStreet1;
	}


	public String getStudentAddressStreet1() {
		return studentAddressStreet1;
	}


	public void setStudentAddressStreet2(String studentAddressStreet2) {
		this.studentAddressStreet2 = studentAddressStreet2;
	}


	public String getStudentAddressStreet2() {
		return studentAddressStreet2;
	}


	public void setStudentAddressCity(String studentAddressCity) {
		this.studentAddressCity = studentAddressCity;
	}


	public String getStudentAddressCity() {
		return studentAddressCity;
	}


	public void setStudentAddressState(String studentAddressState) {
		this.studentAddressState = studentAddressState;
	}


	public String getStudentAddressState() {
		return studentAddressState;
	}


	public void setStudentAddressZipcode(int studentAddressZipcode) {
		this.studentAddressZipcode = studentAddressZipcode;
	}


	public int getStudentAddressZipcode() {
		return studentAddressZipcode;
	}


	public void setStudentBirthDate(int dia, int mes, int ano) {
		this.studentBirthDate = "" + dia + "/" + mes + "/" + ano;
	}


	public String getStudentBirthDate() {
		return studentBirthDate;
	}

}