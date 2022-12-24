//MyServletB.java
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/doServletB")
public class MyServletB extends HttpServlet {

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
    	response.setContentType("text/html; charset=utf-8");
    	PrintWriter out= response.getWriter(); 
        out.print("<h3 style='color:#f0f'>進入doServletB</h3>");
        out.println("<h1 style='color:blue'><b>User:" + request.getParameter("user"));
        out.println(", Employee no:" + request.getParameter("empid") + "</b><h1>");

    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}