package br.senac.pi.exemplows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Connect to Data Base

public class ConexaoDB {
	
	private static final String URL = "jdbc:mysql://localhost:3306/exemplows";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public static Connection conectar() throws SQLException {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		return DriverManager.getConnection(URL, USER, PASSWORD);
		
	}

}
