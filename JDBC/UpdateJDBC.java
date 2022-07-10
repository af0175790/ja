import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateJDBC {
public static void main(String[] args) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c2110","root","root");
Statement stmt = conn.createStatement();
//updating an existing record
stmt.executeUpdate("update customer_table set customerphone = 8765432 where customerid = 2 ");
//delete record
stmt.executeUpdate("delete from customer_table where customerid = 3");
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