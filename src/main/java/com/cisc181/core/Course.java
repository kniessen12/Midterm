package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	
	
	public Course(String CourseName, int GradePoints, eMajor Major){
		
		this.CourseID = UUID.randomUUID();
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}
	
	
	public UUID getCourseID(){
		
		return CourseID;
	}
	
	
	public void setCourseID(UUID newCourseID){
		
		CourseID = newCourseID;
	}
	
	
	public String getCourseName(){
		
		return CourseName;
	}
	
	
	public void setCourseName(String newCourseName){
		
		CourseName = newCourseName;
	}
	
	
	public int getGradePoints(){
		
		return GradePoints;
	}
	
	
	public void setGradePoints(int newGradePoints){
		
		GradePoints = newGradePoints;
	}
	
	
	public eMajor getMajor(){
		
		return Major;
	}
	
	
	public void setMajor(eMajor newMajor){
		
		Major = newMajor;
	}

}