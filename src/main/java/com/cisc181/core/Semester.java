package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	
	
	public Semester(Date StartDate, Date EndDate){
		this.SemesterID = UUID.randomUUID();
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	
	public UUID getSemesterID(){
		return SemesterID;
	}

	
	public void setSemesterID(UUID newSemesterID){
		SemesterID = newSemesterID;
	}
	
	
	public Date getStartDate(){
		return StartDate;
	}

	
	public void setStartDate(Date newStartDate){
		StartDate = newStartDate;
	}
	
	
	public Date getEndDate(){
		return EndDate;
	}

	
	public void setGradePoints(Date newEndDate) {
		EndDate = newEndDate;
	}
	

}
