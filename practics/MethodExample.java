  import java.util.Scanner; 
  class MethodExample{
	// non-static paramter method
public void evenodd(int num)
{
if(num%2==0)
{
System.out.println("It is even"+ num);
}
else 
System.out.println("It is odd"+ num);
}
// static parameter method with return keyword
public static int add (int n1,int n2)
{
	int result = n1+n2;
	return result;
}
public static void main(String args[])
{
int n1 = 500;
int n2 = 100;
int result = add(n1,n2);
System.out.println("Enter number");
System.out.println("the addition is "+result);
Scanner s = new Scanner(System.in);
int num = s.nextInt();
MethodExample m = new MethodExample();
m.evenodd(num);
}
}