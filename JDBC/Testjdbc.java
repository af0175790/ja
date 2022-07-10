import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Testjdbc {
public static void main(String[] args) {
try {
//register driver
Class.forName("com.mysql.cj.jdbc.Driver");
//get connection
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c2110","root","root");
//create statement
Statement stmt = conn.createStatement();
//execute query fetch data from database
ResultSet rs = stmt.executeQuery("select*from customer_table");
//iteration
while (rs.next()) {
System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "+rs.getLong(3));
}
//close database connection
conn.close();
} catch (Exception e) {
System.out.println(e);
}		
}
}