import java.io.Console;
class ConsoleClassExample {
public static void main(String[] args){
Console c = System.console();
System.out.println("Enter your name");
String n = c.readLine();
System.out.println("Welcome " + n);
System.out.println("Welcome " + n);
char [] ch = c.readPassword();
String p = String.valueOf(ch);
System.out.println("Password is : " + p);
}
}