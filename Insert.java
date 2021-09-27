
import java.sql.Connection; 
import java.sql.DriverManager;  
import java.sql.SQLException; 
import java.sql.Statement; 
public class Insert { 
	public static void main(String args[]) throws SQLException { 
 
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
 
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		Connection con = DriverManager.getConnection(DB_URL, "system", "Ganesha"); 
		Statement stmt = con.createStatement(); 
		
		String q1="insert into movies values('Titanic','Leonardo DiCaprio','Kate Winslet',1997,'James Cameron')";
		String q2="insert into movies values('The Notebook','Ryan Gosling','Rachel McAdams',2004,'Nick Cassavetes')";
		String q3="insert into movies values('Dilwale Dulhania Le Jayenge','Shah Rukh Khan','Kajol',1995,'Aditya Chopra')";
		String q4="insert into movies values('Wonder Woman',null,'Gal Gadot',2017,'Patty Jenkins')";
		String q5="insert into movies values('The Pursuit of Happyness','Will Smith',null,2006,'Gabriele Muccino')";
		String q6="insert into movies values('After','Hero Fiennes Tiffin','Josephine Langford',2019,'Jenny Gage')";
		String q7="insert into movies values('The Fault in Our Stars','Ansel Eglort','Shailene Woodley',2014,'Josh Boone')";
		String q8="insert into movies values('Five Feet Apart','Cole Sprouse','Haley Lu Richardson',2019,'Justin Baldoni')";
		stmt.executeUpdate(q1);
		stmt.executeUpdate(q2);
		stmt.executeUpdate(q3);
		stmt.executeUpdate(q4);
		stmt.executeUpdate(q5);
		stmt.executeUpdate(q6);
		stmt.executeUpdate(q7);
		stmt.executeUpdate(q8);
	}
}


