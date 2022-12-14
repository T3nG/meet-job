
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/doComboBox")
public class ReadComboBox extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String book=request.getParameter("book");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>ComboBox</title></head>");
		out.println("<body>");
		out.print("<h2>你的選擇是</h2>");
		out.print("<h1>"+book+"</h1>");
		out.print("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
