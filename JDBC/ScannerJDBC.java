import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class ScannerJDBC {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);	
System.out.println("Enter name :");
String custName = s.next();
System.out.println("Enter phone number :");
String custPhone = s.next();
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c2110","root","root");
//creating statement
PreparedStatement stm;
//inserting data in database table
String sql = "insert into customer_table values(8,?,?)";
stm = conn.prepareStatement(sql);
stm.setString(1,custName);
stm.setString(2,custPhone);
stm.execute();
System.out.println("inserted succesfully");
} catch (Exception e) {
System.out.println(e);
}
}
}