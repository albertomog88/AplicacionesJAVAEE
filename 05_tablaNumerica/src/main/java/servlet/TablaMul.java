package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TablaMul")
public class TablaMul extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int num;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		this.num = Integer.parseInt(request.getParameter("numero"));
		try(PrintWriter out = response.getWriter()){
			out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Tabla de Multiplicar</title>");
	        
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Tabla de Multiplicar del "+num+"</h1>");
	        out.println("<table border='1'>");
	        
	        out.println("<tbody>");
	        
	        
	        for (int i = 1; i <= 10; i++) {//Contenido
	            out.println("<tr>");
	            out.println("<th>" + num +" x "+ i + "</th>");
	            out.println("<th>" + i*num + "</th>");
	            
	            out.println("</tr>");
	        }
	        out.println("</tbody>");
	        out.println("</table>");
	        out.println("</table>");
	        out.println("<a href='Index.html'>Volver</a>");
	        out.println("</html>");
		}
	}

}
