import java.util.Scanner;
public class EvenOdd{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int n;//declare size of array
System.out.println(" Enter the size of the array:");
n=sc.nextInt(); //intialize the arry size
int arr[]=new int[n];
System.out.println("Enterthe array elements");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();//intialize the arry elemthents
}
//even
System.out.println("the even elements are..");
for(int i=0;i<n;i++)
{
if(arr[i]%2==0)
{
System.out.println(arr[i]+" ");
}
}
System.out.println(" "); 
// odd
System.out.println("thee odd elements are..");
for(int i=0;i<n;i++)
{
if(arr[i]%2!=0)
{
System.out.println( arr[i]+" ");
}}
}}