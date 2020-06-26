package died.ejemplos.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	private static final String url ="jdbc:mysql://localhost:3306/died";
	private static final String user="root";
	private static final String pass="root";

	private DB(){
			// no se pueden crear instancias de esta clase
	}

	public static Connection get(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn= DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}
}
