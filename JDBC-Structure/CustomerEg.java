import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class CustomerEg {
Scanner s = new Scanner(System.in);
int id;
String customername;
long customerphone;
//saving customer_table --INSERT
public void saveCustomer() throws SQLException{
System.out.println("Enter customer id :");
id = s.nextInt();
System.out.println("Enter customer name :");
customername = s.next();
System.out.println("Enter customer phone :");
customerphone = s.nextLong();
Connection conn = Helper.con();
PreparedStatement st = conn.prepareStatement("insert into customer_table values(?,?,?)");
st.setInt(1,id);
st.setString(2,customername);
st.setLong(3,customerphone);
st.executeUpdate();
}
// read customer_table - SELECT
public void fetchCustomer() throws SQLException {
Connection conn = Helper.con();
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery("select * from customer_table");
while (rs.next()) {
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3));
} 
}
//modify customer_table - UPDATE
public void updateCustomer() throws SQLException {
Connection conn = Helper.con();
Statement st = conn.createStatement();
System.out.println("Enter customer id :");
id = s.nextInt();
System.out.println("Enter update customer phone");
customerphone = s.nextLong();
st.executeUpdate("update customer_table set customerphone = '"+ customerphone+"'where customerid = "+ id);
}
//remove customer_table - DELETE
public void deleteCustomer() throws SQLException {
Connection conn = Helper.con();
Statement st = conn.createStatement();
System.out.println("Enter customer id :");
id = s.nextInt();
st.executeUpdate("Delete from customer_table where customerid = "+ id);
}
}