import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertJDBC {
public static void main( String[] args ) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c2110","root","root");
Statement stmt = conn.createStatement();
//inserting data int database table
stmt.executeUpdate("insert into customer_table values(7,'divya',8765490)");
System.out.println("inserted succesfully");
conn.close();
} catch (Exception e) {
System.out.println(e);
}
}
}