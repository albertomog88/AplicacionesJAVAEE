package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Error")
public class Error extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String nombre = request.getParameter("username");
		String pass = request.getParameter("password");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>\r\n"
					+ "		<html lang=\"es\">\r\n"
					+ "		<head>\r\n"
					+ "		    <meta charset=\"UTF-8\">\r\n"
					+ "		    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "		    <title>Inicio de Sesión</title>\r\n"
					+ "		    <!-- Tailwind CSS -->\r\n"
					+ "		    <link href=\"https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css\" rel=\"stylesheet\">\r\n"
					+ "		    <!-- Custom CSS -->\r\n"
					+ "		    <link rel=\"stylesheet\" href=\"css/styles.css\">\r\n"
					+ "		</head>\r\n"
					+ "		<body class=\"bg-gray-900 flex items-center justify-center h-screen\">\r\n"
					+ "		    <div class=\"max-w-md w-full bg-gray-800 rounded-lg shadow-md p-8\">\r\n"
					+ "		        <h2 class=\"text-3xl font-bold text-red text-center mb-6\">Error</h2>\r\n"
					+ "		        ");
			
			out.println("<h1 class=\"text-3xl font-bold text-white text-center mb-6\"> El usuario "+nombre +" con contraseña "+pass+" no es correcto</h1>");
			out.println("</div></body></html>");
		}
	}

}
