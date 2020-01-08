package Day55_Polymorphisim;

import java.util.ArrayList;
import java.util.Arrays;

abstract class ScrumTeam{
	
	public String Name, JobTitle;
	
	public double Salary;
	
	public abstract void DailyStandUp();
	
	public abstract void Demo();	
	
	public void getEmployeeInfo() {
		System.out.println("=========================");
		System.out.println("Employee Name: "+Name);
		System.out.println("Job Title: "+JobTitle);
		System.out.println("Salary: $"+Salary);
		System.out.println("=========================");
	}
}

class Testers extends ScrumTeam {
	
	public Testers(String Name, String JobTitle, double Salary) {
		
		this.Name = Name;
		this.JobTitle= JobTitle;
		this.Salary = Salary;	
	}
	
	@Override
	public void DailyStandUp(){
	System.out.println("Tester "+ Name+" is talking");	
	}
	
	
	@Override
	public void Demo() {
		
		System.out.println("Tester+"+Name+" is doing demo");
	}	
	
	
}

class Developers extends ScrumTeam{
	
	public Developers (String Name, String JobTitle, double Salary) {
		
		this.JobTitle= JobTitle;
		this.Name=Name;
		this.Salary=Salary;
	}
	
	
	
public  void DailyStandUp() {
	System.out.println("Tester"+Name+" 'is talking");
}
	
	public  void Demo()	{
		System.out.println("Tester"+Name+" is doing demo");
	}
	
	
	
	
}

public class BOA {
	
	public static void main(String[] args) {
		
		ScrumTeam Madina = new Testers("Madina","SDET",130000);
		Testers Akerke = new Testers("Akerke","Automation Tester",100000);
		Testers Erhan =	 new Testers("Erhan Holly","Manual Tester",40000);
	
		
		ScrumTeam[] testers = {Madina,Akerke,Erhan };
		/*
		for (ScrumTeam each: testers) {
			
		each.getEmployeeInfo();
			
		}
		*/
		ScrumTeam Nadire = new Developers("Nadire","Senior Developer",150000);
		Developers Mahir = new Developers("Mahir", "Junior Developer", 130000);
		Developers Parsa = new Developers("Parsa", "Medium Developer", 220000);
		Developers Dilara = new Developers("Dilara","Developer", 20000);
		
		
		ScrumTeam [] developers = {Nadire,Mahir,Parsa,Dilara };
		/*
		for (ScrumTeam each: developers) {
			
			each.getEmployeeInfo();	
		}
		*/
		
		ArrayList<ScrumTeam> scrum = new ArrayList<>();
		scrum.addAll(Arrays.asList(testers) );
		scrum.addAll(Arrays.asList(developers) );
		
		for (ScrumTeam each : scrum) {
			
			each.getEmployeeInfo();
			
		}
		
		
	}
	
	

}
