package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SELECTQUERY {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Manny@1998");

		Statement smt = con.createStatement();

		String s = "SELECT SNO, SNAME, MARKS FROM STUDENT1";

		ResultSet rst = smt.executeQuery(s);

		while (rst.next()) {
			int sno = rst.getInt("SNO");
			String sname = rst.getString("SNAME");
			int marks = rst.getInt("Marks");
			
			System.out.println(sno+" "+sname+" "+marks+" ");
		}
		
		con.close();
		
		System.out.println("Query executed");

	}

}
