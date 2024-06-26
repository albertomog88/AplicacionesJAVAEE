package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		RequestDispatcher dispatcher;
		if(user.equals("admin") && pass.equals("root")) {
			dispatcher = request.getRequestDispatcher("Bienvenida.jsp");
		}
		else {
			dispatcher = request.getRequestDispatcher("Error.jsp");
		}
		dispatcher.forward(request, response);
	}
	
	

}
