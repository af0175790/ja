public class LARGESTandSMALLnumber{
public static void main (String args[])
{
int arr[]= new int[]{12,56,76,89,100,23,55,10,11,1,0,6};
int smallest = arr[0];
int largest = arr[0];
for (int i=1;i<arr.length;i++)
{ 
if(arr[i]> largest)
largest = arr[i];
else if(arr[i] < smallest)
smallest = arr[i];}
System.out.println("Smallest number is:"+ smallest);
System.out.println("Largest number is:"+ largest);
}}