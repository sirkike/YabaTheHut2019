package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//declaro la conexion a la BD BibliotecaJava

public class Conexion {
	
	private String USERNAME = "root";
	private String PASSWORD = "";
	private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "BibliotecaJava";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
    
    //Constructor
    public Conexion() throws SQLException {
    	try {
    		Class.forName(CLASSNAME);
    		con = DriverManager.getConnection(URL, USERNAME, PASSWORD);    		
    	}catch (ClassNotFoundException e){
    		System.err.println("ERROR"+e);
    		
    	}catch(SQLException e) {
    		System.err.println("ERROR"+e);
    	}
    	
    }
    
    //metodo que nos da la conexion
    public Connection getConexion() {
    	return con;
    }


   

}
