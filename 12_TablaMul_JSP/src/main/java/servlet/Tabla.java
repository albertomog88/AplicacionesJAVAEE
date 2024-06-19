package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/tabla")
public class Tabla extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String numero=request.getParameter("numero");
		RequestDispatcher dispatcher;
		if(isNumber(numero) ) {
			dispatcher = request.getRequestDispatcher("tablaMul.jsp");
		}
		else {
			dispatcher = request.getRequestDispatcher("ErrorMul.jsp");
		}
		dispatcher.forward(request, response);
		
	}
	
	private boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
