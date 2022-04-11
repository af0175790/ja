public class FABB{
  public static void main (String args[])
  {
   int count = 6;
    int a=0;
     int b=2;
   System.out.print("Fibonacci series of "+count+"numbers");
    for (int i=1;i<= count;i++)
	{
	System.out.print(a+" ");
	int sumOfPrevTwo = a+b;
	a=b;
	b= sumOfPrevTwo;}}}