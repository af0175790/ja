 import java.util.Scanner;
 public class FactorialUsingLoop
 {
 public static void main(String agrs[])
 {
 int fact = 1;
 int i =1 ;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number whosefactorial is to be found:");
 int num = sc.nextInt();
 while (i<=num)
 {
 fact = fact*i;
 i++;
 }
 System.out.println("/n factorialof" +num+" is:"+fact);
 }}