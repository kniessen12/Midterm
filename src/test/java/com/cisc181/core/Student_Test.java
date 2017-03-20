package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;
import com.cisc181.core.PersonException;
import java.util.Date;
import java.util.UUID;

public class Student_Test {
	
	static ArrayList<Course> course = new ArrayList<Course>();
	static ArrayList<Semester> semester = new ArrayList<Semester>();
	static ArrayList<Section> section = new ArrayList<Section>();
	static ArrayList<Student> student = new ArrayList<Student>();
	static ArrayList<Enrollment> Enrollment = new ArrayList<Enrollment>();
	static ArrayList<Double> GPA = new ArrayList<Double>();
	
	static Course course1;
	static Course course2;
	static Course course3;
	
	static Semester Fall;
	static Semester Spring;
	
	static Section section1_course1_Fall;
	static Section section2_course1_Spring;
	static Section section1_course2_Fall;
	static Section section2_course2_Spring;
	static Section section1_course3_Fall;
	static Section section2_course3_Spring;
	
	static Student student1;
	static Student student2;
	static Student student3;
	static Student student4;
	static Student student5;
	static Student student6;
	static Student student7;
	static Student student8;
	static Student student9;
	static Student student10;
	
	static Double StanGPA;
	static Double KyleGPA;
	static Double EricGPA;
	static Double KennyGPA;
	static Double ButtersGPA;
	static Double WendyGPA;
	static Double ClydeGPA;
	static Double CraigGPA;
	static Double TimmyGPA;
	static Double TokenGPA;
	
	
	

	@BeforeClass
	public static void setup() throws PersonException{
		
		Course course1 = new Course("PHYS 208",4,eMajor.PHYSICS);
		Course course2 = new Course("BUS 101",4,eMajor.BUSINESS);
		Course course3 = new Course("CISC 181",4,eMajor.COMPSI);
		course.add(course1);
		course.add(course2);
		course.add(course3);
		
		Semester Fall = new Semester(new Date(), new Date());
		Semester Spring = new Semester(new Date(), new Date());
		semester.add(Fall);
		semester.add(Spring);
		
		Section section1_course1_Fall = new Section(course1.getCourseID(), Fall.getSemesterID(), 100);
		Section section2_course1_Spring = new Section(course1.getCourseID(), Fall.getSemesterID(), 200);
		Section section1_course2_Fall = new Section(course2.getCourseID(), Fall.getSemesterID(), 300);
		Section section2_course2_Spring = new Section(course2.getCourseID(), Fall.getSemesterID(), 400);
		Section section1_course3_Fall = new Section(course3.getCourseID(), Fall.getSemesterID(), 500);
		Section section2_course3_Spring = new Section(course3.getCourseID(), Fall.getSemesterID(), 600);
		section.add(section1_course1_Fall);
		section.add(section2_course1_Spring);
		section.add(section1_course2_Fall);
		section.add(section2_course2_Spring);
		section.add(section1_course3_Fall);
		section.add(section2_course3_Spring);
		
		Student student1 = new Student("Stan","S","Marsh", new Date(), "PHYSICS", "add1","(610)-222-3331","Stan@udel.edu");
		Student student2 = new Student("Kyle","K","Broflovski", new Date(), "CHEM", "add2","(610)-222-3332","Kyle@udel.edu");
		Student student3 = new Student("Eric","E","Cartman", new Date(), "BUSINESS", "add3","(610)-222-3333","Eric@udel.edu");
		Student student4 = new Student("Kenny","K","McCormick", new Date(), "COMPSI", "add4","(610)-222-3334","Kenny@udel.edu");
		Student student5 = new Student("Butters","B","Stotch", new Date(), "NURSING", "add5","(610)-222-3335","Butters@udel.edu");
		Student student6 = new Student("Wendy","W","Testaburger", new Date(), "PHYSICS", "add6","(610)-222-3336","Wendy@udel.edu");
		Student student7 = new Student("Clyde","C","Donovan", new Date(), "CHEM", "add7","(610)-222-3337","Clyde@udel.edu");
		Student student8 = new Student("Craig","C","Tucker", new Date(), "BUSINESS", "add8","(610)-222-3338","Craig@udel.edu");
		Student student9 = new Student("Timmy","T","Burch", new Date(), "COMPSI", "add9","(610)-222-3339","Timmy@udel.edu");
		Student student10 = new Student("Token","T","Black", new Date(), "NURSING", "add10","(610)-222-3340","Token@udel.edu");
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);
		student.add(student6);
		student.add(student7);
		student.add(student8);
		student.add(student9);
		student.add(student10);
		
		Double StanGPA = new Double(3.2);
		Double KyleGPA = new Double(2.2);
		Double EricGPA = new Double(3.9);
		Double KennyGPA = new Double(2.4);
		Double ButtersGPA = new Double(3.0);
		Double WendyGPA = new Double(3.1);
		Double ClydeGPA = new Double(1.9);
		Double CraigGPA = new Double(2.7);
		Double TimmyGPA = new Double(3.6);
		Double TokenGPA = new Double(2.4);
		
		GPA.add(StanGPA);
		GPA.add(KyleGPA);
		GPA.add(EricGPA);
		GPA.add(KennyGPA);
		GPA.add(ButtersGPA);
		GPA.add(WendyGPA);
		GPA.add(ClydeGPA);
		GPA.add(CraigGPA);
		GPA.add(TimmyGPA);
		GPA.add(TokenGPA);
		
	}

	@Test
	public void Enrollment() {
		
		for(Student student : student){
			for(Section section: section){
				Enrollment enrollment = new Enrollment(student.getStudentID(), section.getCourseID());
				enrollment.setGrade(4.0);
				Enrollment.add(enrollment);
			}
		}
	}
		
	@Test
	public void GPA(){
		
			double GPA = 0.0;
			for(Double GPA1 : GPA){
				GPA1 =+ GPA1.getGrade();
			}
		
		assertEquals(4.0,GPA,0.01);
		}
		
	}
	
	@Test
	public void CourseAverage(){
		
		double Sum = 0;
		for(Course course : course){
			
			Sum += course.getGradePoints();
		}
		int Average = (int) (Sum / course.size());
		assertEquals(2.84,Average,0.01);
		
	}
}