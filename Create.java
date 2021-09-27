import java.sql.Connection; 
import java.sql.DriverManager;  
import java.sql.SQLException; 
import java.sql.Statement; 
public class Create { 
	public static void main(String args[]) throws SQLException { 
 
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
 
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		Connection con = DriverManager.getConnection(DB_URL, "system", "Ganesha"); 
		Statement stmt = con.createStatement(); 
		
		String q1="create table movies(\r\n"
				+ "movie_name varchar(40),\r\n"
				+ "lead_actor varchar(40),\r\n"
				+ "lead_actress varchar(40),\r\n"
				+ "year_of_release int,\r\n"
				+ "director varchar(40),\r\n"
				+ "primary key(movie_name)\r\n"
				+ ")";
		
		stmt.executeUpdate(q1);
		
	}
}
