
public class StringExample{
public void show()
{
char [] arr = {'j','a','v','a'};
String s = new String (arr);// convert ch array to string
System.out.println("The value is:" +s);
System.out.println(arr);
}
public void myFunction()
{
String m = "vibin";// string literal
String m1 = "vibin p";
String m2 = new String("vibin");// string new keyword
}
public static void main (String args[])
{// todo auto-generated method stub
StringExample obj = new StringExample();
obj.show();
obj.myFunction();
}
}