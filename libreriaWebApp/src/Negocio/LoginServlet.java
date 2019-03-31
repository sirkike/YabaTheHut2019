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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                   throws ServletException, IOException, SQLException {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = response.getWriter();
    	
    	//capturo los datos del formulario Login
    	String usuario = request.getParameter("Usuario");
    	String contrasenia = request.getParameter("Contraseņa");
    	
    	//Llamo a Consultas y le paso los parametros al metodo de autenticacion
    	Consultas co = new Consultas();
    	if(co.autenticacion(usuario, contrasenia)) {
    		response.sendRedirect("Menu.jsp");
    	}else {
    		response.sendRedirect("Login.jsp");
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
