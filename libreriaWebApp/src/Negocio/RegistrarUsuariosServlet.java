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
 * Servlet implementation class RegistrarUsuariosServlet
 */
@WebServlet("/Registrar")
public class RegistrarUsuariosServlet extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException {
	
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	
	
	//Capturo los datos del usuario
	String nombreApellido = request.getParameter("NombreApellido");
	String usuario = request.getParameter("Usuario");
	String contraseña = request.getParameter("Contraseña");
	
	//Creo la consulta que va a insertar los datos en la BD
	Consultas co = new Consultas();
	if(co.registraUsuario(nombreApellido, usuario, contraseña)) {
		response.sendRedirect("Login.jsp");
	}else {
		response.sendRedirect("RegistroUsuarioLogin.jsp");
	}
	
	
	
}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processRequest (request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 }

}
