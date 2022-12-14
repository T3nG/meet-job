
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/doRedirect")
public class RedirectToTarget extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 轉址到Servlet
		response.sendRedirect("doServlet2");
		
		// 轉址到html
        //response.sendRedirect("targetHTML2.html");
		
		// 轉址到JSP
        //response.sendRedirect("targetJSP2.jsp");
		
		// 轉址到yahoo
        //response.sendRedirect("http://tw.yahoo.com");
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
