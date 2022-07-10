import java.util.Scanner;
public class ScannerLaptopDemo {
public static void main(String[] args) {
char ans = 0;
do {
Scanner s = new Scanner(System.in);
System.out.println("Enter Choice:\n 1:Add-1 \n 2:Subtract-2 \n 3:Multiply-3 \n 4:Quit-4");
int ch = s.nextInt();
switch (ch) {
case 1:
System.out.println("Enter two numbers to be added :");
System.out.print("Enter First Number : ");
int input1 = s.nextInt();
System.out.print("Enter Second Number : ");
int input2 = s.nextInt();
int add = input1 + input2;
System.out.println("The result is :" + add);
break;
case 2:
System.out.println("Enter two numbers to be Subtracted :");
System.out.print("Enter First Number : ");
int input3 = s.nextInt();
System.out.print("Enter Second Number : ");
int input4 = s.nextInt();
int sub = input3 - input4;
System.out.println("The result is :" + sub);
break;
case 3:
System.out.println("Enter two numbers to be multiplied :");
System.out.print("Enter First Number : ");
int input5 = s.nextInt();
System.out.print("Enter Second Number : ");
int input6 = s.nextInt();
int mul = input5 * input6;
System.out.println("The result is :" + mul);
break;
case 4:
System.out.println("Okay Bye");
break;
}
System.out.println("Do you want to do the process again");
ans = s.next().charAt(0);
} while(ans=='y'|| ans=='Y');
}
}