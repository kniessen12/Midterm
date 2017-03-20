package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	
	
	public Section(UUID CourseID, UUID SemesterID,int RoomID){
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = UUID.randomUUID();
		this.RoomID = RoomID;
	}
	
	
	public UUID getCourseID(){
		return CourseID;
	}

	
	public void setCourseID(UUID newCourseID){
		CourseID = newCourseID;
	}
	
	
	public UUID getSemesterID(){
		return SemesterID;
	}

	
	public void setSemesterID(UUID newSemesterID){
		SemesterID = newSemesterID;
	}
	
	
	public UUID getSectionID(){
		return SectionID;
	}

	
	public void setSectionID(UUID newSectionID){
		SectionID = newSectionID;
	}
	
	
	public int getRoomID(){
		return RoomID;
	}

	
	public void setRoomID(int newRoomID){
		RoomID = newRoomID;
	}

}
