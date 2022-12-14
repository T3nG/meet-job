
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/doTwo")
public class TwoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		String msg=(String)session.getAttribute("data");
		//String msg=(String)request.getAttribute("data");
		//int msg=(int)request.getAttribute("data");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<h1 style='color:red;'>取得的資料是: " + msg + "</h1>");

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
