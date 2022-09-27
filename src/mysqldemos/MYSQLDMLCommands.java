
package mysqldemos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		// 1 Create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Manny@1998");
	
	//2. Create statement 
	Statement smt=con.createStatement();
	//String s= "INSERT INTO STUDENT1 VALUES(204,'ABBAS',300)";
	
	//update statement.
	//String s= "UPDATE STUDENT1 SET SNAME='DAVID' WHERE SNO=204";
	
	//Delete statement
	String s="DELETE FROM STUDENT1 WHERE SNO=204";
	
	
	//3execute statement 
	smt.execute(s);
	
	//4 close connection
	con.close();
	
	System.out.println("Query executed");
	
	
	}
}