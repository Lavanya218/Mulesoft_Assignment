
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.ResultSetMetaData; 
import java.sql.SQLException; 
import java.sql.Statement; 
public class Query2 { 
	public static void main(String args[]) throws SQLException { 
 
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
 
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		Connection con = DriverManager.getConnection(DB_URL, "system", "Ganesha"); 
		Statement stmt = con.createStatement(); 
		String query = "Select movie_name from movies where lead_actor='Ryan Gosling'"; 
		ResultSet rs = stmt.executeQuery(query); 
		ResultSetMetaData rsMeta=rs.getMetaData();
 
		int noOfCols=rsMeta.getColumnCount();
		for(int i=1;i<=noOfCols;i++){
			System.out.printf("%-30s",rsMeta.getColumnName(i));
		}
		System.out.println();
		while(rs.next()){
			for(int i=1;i<=noOfCols;i++) {
				System.out.printf("%-30s",rs.getObject(i));
			}
			System.out.println();
		}
	}
}
