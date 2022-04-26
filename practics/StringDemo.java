import java.util.Scanner;
public class StringDemo{
public void show(){
Scanner s = new Scanner (System.in);
System.out.println("Enter the string");
String A =s.next();//hello
String B = s.next();//java
System.out.println(A.length() +B.length());
System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) +" "+ B.substring(0,1).toUpperCase()+ B.substring(1));
System.out.println((A.compareTo(B) >0)? "yes":"no");

}
public static void main(String args[]){
//auto -generated method stub
StringDemo d = new StringDemo();
d.show();
}
}