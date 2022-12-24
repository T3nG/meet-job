
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.PrintWriter;

@WebServlet("/doMyServletC")
public class MyServletC extends HttpServlet {

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out= response.getWriter(); 
        out.println("<h1 style='color:blue'><b><br>User:" + request.getParameter("user")+ "</b><h1>");
        
        HttpSession session=request.getSession();
        String no = (String)session.getAttribute("empid");
        out.println("<h1 style='color:blue'><b>Employee number:" + no + "</b><h1>");
        
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
