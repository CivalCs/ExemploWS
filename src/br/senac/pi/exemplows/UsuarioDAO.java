package br.senac.pi.exemplows;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class UsuarioDAO {
	
	public boolean insertUsuario(Usuario usuario){
		try{
			Connection conn = ConexaoDB.conectar();
			String sqlInsert = "INSERT INTO usuario VALUES (null, ?, ?)";
			PreparedStatement preparedStatement = conn.prepareStatement(sqlInsert);
			preparedStatement.setString(1,usuario.getNome());
			preparedStatement.setInt(2,usuario.getIdade());
			preparedStatement.executeUpdate();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
