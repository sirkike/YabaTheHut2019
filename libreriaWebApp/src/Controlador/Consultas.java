package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas extends Conexion {

	public Consultas() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

//Este metodo autentica el usuario ingresado en el login
	public boolean autenticacion(String usuario, String contraseña) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			String consulta = "select * from user where user = ? and password = ?"; //query a la BD
			pst = getConexion().prepareStatement(consulta); //le paso la query a la conexion
			pst.setString(1, usuario);   // paso el primer parametro
			pst.setString(2, contraseña); //paso el segundo parametro
			
			//guardo el resultado de la consulta en rs (result set)
			rs = pst.executeQuery();
			
			//si la consulta devuelve 1 registro retorna true
			if(rs.absolute(1)) {
				return true;
			}
			
					
		}catch (Exception e) {
			System.err.println("ERROR"+e);   //error en la conexion
		}finally {
			try {
				if (getConexion() != null) getConexion().close(); //Cierro la conexion si esta abierta
				if (pst != null) pst.close();
				if (rs != null) rs.close();
			}catch(Exception e) {
				System.err.println("ERROR"+e);	
			}
			
		}
				
		return false;
	}


//Este metodo registra un nuevo usuario en la base
	//agregar control para cuando se quiera registrar una persona con un user que ya exista
public boolean registraUsuario (String nombreUsuario, String usuario, String contraseña) {
	
	PreparedStatement pst = null;  //no necesitamos ResultSet porque no vamos a devolver nada, solo insertamos
	try {
		String consulta = "insert into user (userName,user,userType,password) values(?,?,2,?)";
		pst = getConexion().prepareStatement(consulta); //pasamos la conexion
		pst.setString(1, nombreUsuario);  //pasamos los 3 parametros
		pst.setString(2, usuario);
		pst.setString(3, contraseña);
		
		if(pst.executeUpdate() == 1) { 
			return true;
		}
		
		
	}catch(Exception e) {
		System.err.println("ERROR"+e);
		
	}finally {
		try {
			if(getConexion() != null) getConexion().close();
			if(pst != null) pst.close();
			
		}catch(Exception e) {
			System.err.println("ERROR"+e);
		}
		
		
	}
	return false;
	
}


} //Cierra la clase