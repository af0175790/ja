package com;

import java.util.Scanner;

public class EmployeeSalaryLab28 {
public static void main(String args[]) {
	float basic_salary,da,hra,da1,hra1,GrossPayment;

	  Scanner scan = new Scanner(System.in);

	  System.out.println("Enter Basic Salary Of Employee: ");
	  basic_salary=scan.nextFloat();

	  System.out.println("Enter Basic DA Of Employee: "); 
	  da1=scan.nextFloat();
	 
	  System.out.println("Enter Basic HRA Of Employee: ");
	  hra1=scan.nextFloat();

	  da = (da1 * basic_salary) / 100;
	  hra = (hra1 * basic_salary) / 100;
	  
	  if (basic_salary>5000) {
			float hra2 = 200; float DA1 = (float) (da*0.9);
			GrossPayment = basic_salary + hra2 + DA1;
	   } else {
		    float hra3=500; float DA2 = (float) (da*0.7);
		    GrossPayment = basic_salary + hra3 + DA2;
		}
	  
	  System.out.println("Gross Salary Of Employee: "+GrossPayment);
}
}