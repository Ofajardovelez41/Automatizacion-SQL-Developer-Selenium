package pruebaV;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionSQLySelenium {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.143:1521/xe", "system","system");
		
		Statement stmt=con.createStatement();
		
		String insert= "insert into SUCURSAL values(14,'cacha','Cali',3016844125)";
		stmt.executeQuery(insert);
		
		String update= "update SUCURSAL set NOMBRE = 'OMH' where ID = 12";
		stmt.executeQuery(update);
		
		String delete= "delete SUCURSAL where ID = 13";
		stmt.executeQuery(delete);
		
		
		con.close();
		
		System.out.println("todo marcha bien");
	}

}
