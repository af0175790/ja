import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int a,b,y=0,temp=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter any number:");
b = s.nextInt();
y = b;
while (b>0)
{
a = b%10;
b = b/10;
temp = temp*10+a;
} 
if(temp == y)
{
System.out.println("number is  palindrome");
}
else{
System.out.println("number is  not  palindrome");
}}}