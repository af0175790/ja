import java.util.Scanner;
class ATM{
public static void main(String args[])
{
int balance = 5000,withdraw,deposite;
Scanner s =new Scanner(System.in);
while(true)
{
System.out.println("Welcome to SBI");
System.out.println("1:withdraw");
System.out.println("2: Deposite");
System.out.println("3: Check Balance");
System.out.println("4: Exit");

int ch = s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter amount for withdaw:");
withdraw = s.nextInt();
if (balance>=withdraw)
{
System.out.println("Collect your money");
System.out.println("Remaining balance is : +balance");
}else
{
System.out.println("Insufficient Balance");
System.out.println(" ");
}
break;
case 2:
System.out.println("Enter amount for deposite:");
deposite = s.nextInt();
balance = balance+deposite;
System.out.println("your money is successfully deposited into your account");
System.out.println("Remaining balance is:"+balance);
System.out.println(" ");
break;
case 3:
System.out.println("Balance:" +balance);
System.out.println(" ");
break;
case 4:
System.out.println("Thankyou ....come again....");
System.exit(0);
break;
}
}
}
}