package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import com.cisc181.eNums.eTitle;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	static ArrayList<Staff> staff = new ArrayList<Staff>();
	
	static Staff staff1;
	static Staff staff2;
	static Staff staff3;
	static Staff staff4;
	static Staff staff5;
	static Staff staff6;
	static Staff staff7;

	@BeforeClass
	public static void setup() throws PersonException {	
		
		staff1 = new Staff("Adam","Brock","Calvin",new Date(),"Street1","(610)-333-4444","123 Street","Adam@udel.edu",1,1000.0,new Date(),eTitle.SIR);
		staff2 = new Staff("Dave","Emmitt","Fred",new Date(),"Street2","(610)-444-5555","123 Street","Dave@udel.edu",2,2000.0,new Date(),eTitle.DR);
		staff3 = new Staff("Gus","Hank","James",new Date(),"Street3","(610)-555-7777","123 Street","Gus@udel.edu",3,3000.0,new Date(),eTitle.PROF);
		staff4 = new Staff("Kevin","Larry","Mike",new Date(),"Street4","(610)-777-1111","123 Street","Kevin@udel.edu",4,4000.0,new Date(),eTitle.SIR);
		staff5 = new Staff("Nelson","Owen","Randy",new Date(),"Street5","(610)-222-9999","123 Street","Nelson@udel.edu",5,5000.0,new Date(),eTitle.PROF);
		
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		staff.add(staff5);
		
	}
	
	@Test
	public void testSalaryAverage(){
		double Sum = 0.0;
		
		for(Staff S: staff){
			Sum += S.getSalary();
		}
		
		int Average = (int) (Sum / staff.size());
		assertEquals(Average,3000);
	}	
	
	@Test(expected = PersonException.class)
	public void testDOB() throws PersonException{
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2300);
		cal.set(Calendar.MONTH,1);
		cal.set(Calendar.DATE,1);
		Date date = cal.getTime();
		
		staff6 = new Staff("Jamie","Gene","Laura", new Date(),"123 Street","610-364-2485","123 Street","Jamie@uddel.edu",6,6000,new Date(),eTitle.DR);
		try{
			
			staff6.setDOB(date);
		
		} catch(Exception e){
			
			System.out.println("DOB invalid");
		}
	}
	
	
	@Test(expected = PersonException.class)
	public void testPhoneNumber() throws PersonException{
		
		staff7 = new Staff("Lee","Rob","Alex", new Date(),"123 Street","610-434-3245","123 Street","Lee@uddel.edu",6,6000,new Date(),eTitle.DR);
		
		try{
			
			staff7.setPhone("4356");
		
		} catch(Exception e){
			
			System.out.println("Phone number invalid");
	}
}
	

}
