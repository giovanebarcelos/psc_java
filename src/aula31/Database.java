package aula31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private static final String JDBC_DRIVER = 
			"org.sqlite.JDBC";
	private static final String DBURL = 
			"jdbc:sqlite:alunos.db";
	private static Connection conn = null;  

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if (conn != null) {
			return conn;
		}
		
		// Registrar o driver JDBC 
		Class.forName(JDBC_DRIVER);
		
		conn = DriverManager.getConnection(DBURL);		

		criarTabelas();
		
		return conn;
	}

	private void criarTabelas() throws SQLException {
		String sql = 
				"CREATE TABLE IF NOT EXISTS ALUNO ("+
		               "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
					   "nome TEXT NOT NULL,"+
		               "curso TEXT NOT NULL)";
		
		Statement stm = conn.createStatement();
		
		stm.executeUpdate(sql);
	}
}
