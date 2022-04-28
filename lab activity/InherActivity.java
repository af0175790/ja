import java.util.*;
import java.lang.*;
import java.io.*;
	 class employee {
		 static long employeeId;
		 static String employeeName;
		 static String employeeAddress;
		 static long employeePhone;
		 static double basicSalary;
		 static double specialAllowance = 250.80;
		 static double hra =1000.50;
		 
		 protected static long getEmployeeId()
		 {
			 return employeeId;
		 }		
         protected static void getEmployeeId(long Id)
		 {
			 employee.employeeId = Id;
		 }	
		 protected static long getEmployeeName()
		 {
			 return employeeName;
		 }		
		 
         protected static String getEmployeeName(String Name)
		 {
			 employee.employeeName = Name;
		 }	
         protected static void getEmployeeAddress()
		 {
			 return employeeAddress;
		 }	
         protected static void getEmployeeAddress(String Address)
		 {
			 employee.employeeAddress = Address;
		 }	
         protected static long getEmployeePhone()
		 {
			 return employeePhone;
		 }		
         protected static void getEmployeePhone(long Phone)	
		 {
			 employee.employeePhone = Phone;
	
          }
        public static void calculateSalary()
		{
			double salary = basicSalary + (basicSalary *(specialAllowance/100) + (basicSalary*hra/100));
			System.out.println(salary);
		}	
        public double calculateTransportAllowance()
         { double transportAllowance = 10/100*basicSalary;
             return transportAllowance;
			 }		
	      }
		  
		 


		  class Manager extends employee{
			  protected static double getBasicSalary(){
				  return basicSalary;
			  }
			  protected static void setBasicSalary(double basicSalary)
			  {
				  Manager.basicSalary = basicSalary;
			  }
			  @Override
			  public double calculateTransportAllowance(){
				  double transportAllowance = 15*basicSalary/100;
				  return transportAllowance;
			  }
		  }
		 


		  class Trainee extends employee{
			  protected static double getBasicSalary(){
				  return basicSalary;
			  }
			  protected static void setBasicSalary(double basicSalary)
			  {
				  Trainee.basicSalary = basicSalary;
			  }
			  
			  
			  @Override 
			  public double calculateTransportAllowance()
			  {
				  double transportAllowance = 10/100*basicSalary;
				  return transportAllowance;
			  }
		  }
	 public class InherActivity{
		 
	 static Manager manager = new Manager();
	 static Trainee trainee = new Trainee();
	 manager.display();
	 trainer.display();
	 
	 public static void main (String[] args)
	 {
	  testCase1();//manager salary
	  System.out.println(manager.calculateTransportAllowance());
	  
	  testCase2();//trainee salary
	   System.out.println(trainee.calculateTransportAllowance());
	   }
	   
	   protected static void testCase1()
	   {
	   manager.setEmployeeId(126534);
	   manager.setEmployeeName("Peter");
	   manager.setEmployeeAddress("Chennai India");
	   manager.setEmployeePhone(237844);
	   manager.setBasicSalary(65000);
	   manager.calculateSalary();
	   }
	   
	   protected static void testCase2()
	   {
	   trainee.setEmployeeId(29846);
	   trainee.setEmployeeName("Jack");
	   trainee.setEmployeeAddress("Mumbai India");
	   trainee.setEmployeePhone(442085);
	   trainee.setBasicSalary(45000);
	   trainee.calculateSalary();
	   }
	   }