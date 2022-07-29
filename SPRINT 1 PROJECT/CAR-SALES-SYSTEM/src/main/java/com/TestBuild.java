package com;

import java.util.Scanner;

import com.DaoImpl.CarListImpl;
import com.DaoImpl.SalesListImpl;

public class TestBuild {
public static void main(String[] args) {
CarListImpl cr = new CarListImpl();
SalesListImpl sa = new SalesListImpl();
while (true) {
	Scanner s = new Scanner(System.in);
	System.out.println("-------------Car Sales Management System-------------");
	System.out.println("Enter Choice");
	System.out.println(" 1. Manage Car Details \n 2. Manage Sales Details \n 3. Exit");
	int ch = s.nextInt();
	switch (ch) {
	case 1:
		Scanner s1 = new Scanner(System.in);
		System.out.println("-------------Manage Car Details-------------");
		System.out.println("Enter Choice");
		System.out.println(" 1. Add Car Details \n 2. Update Car Details \n 3. Delete Car Details \n 4. Show Car Details \n 5. Back");
		int ch1 = s.nextInt();
		switch (ch1) {
		case 1:
			cr.AddCar();
			break;
        case 2:
			cr.UpdateCar();
			break;
        case 3:
	        cr.DeleteCar();
	        break;
        case 4:
	        cr.ShowCar();
	        break;
        case 5:
	        System.out.println("Going Back to Main Menu");
	        break;

		default:
			System.out.println("Wrong Choice of Number");
			break;
		}
		break;
    case 2:
    	Scanner s2 = new Scanner(System.in);
		System.out.println("-------------Manage Sales Details-------------");
		System.out.println("Enter Choice");
		System.out.println(" 1. Add Sales Details \n 2. Update Sales Details \n 3. Delete Sales Details \n 4. Show Sales Details \n 5. Back");
		int ch2 = s.nextInt();
		switch (ch2) {
		case 1:
			sa.AddSales();
			break;
        case 2:
			sa.UpdateSales();
			break;
        case 3:
        	sa.DeleteSales();
        	break;
	        
        case 4:
	       sa.ShowSales();
	        break;
        case 5:
	        System.out.println("Going Back to Main Menu");
	        break;

		default:
			System.out.println("Wrong Choice of Number");
			break;
		}
		break;
    case 3:
    	System.out.println("Thank You !!!");
    	System.exit(0);
	break;

	default:
		System.out.println("Wrong Choice of Number Try Again !");
		break;
	}
}
}
}
