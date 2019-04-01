package Negocio;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controlador.Consultas;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Iniciar")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
 @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//capturo los datos del formulario Login
 	String usuario = request.getParameter("Usuario");
 	String contrasenia = request.getParameter("Contraseña");
 	
 	//Llamo a Consultas y le paso los parametros al metodo de autenticacion
 	try {
 	Consultas co = new Consultas();
 	if(co.autenticacion(usuario, contrasenia)) {
 		response.sendRedirect("Menu.jsp");
 	}else {

 		response.sendRedirect("Login.jsp");
 
 	}
 	
 }catch(Exception e) {
	 }
 }

}
