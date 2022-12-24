
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/doRadioButton")
public class ReadRadioButton extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String sport=request.getParameter("sport");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		String returnValue="";
		if(sport!=null) {
			
			switch(sport) {
				case "1":
					returnValue="打球";
					break;
				case "2":
					returnValue="爬山";
					break;
				case "3":
					returnValue="游泳";
					break;
				case "4":
					returnValue="跳舞"; 			
			}
		}
		else
			returnValue="未選取";

		out.println("<html><head><title>RadioButton</title></head>");
		out.println("<body>");
		out.print("<h2>你的選擇是</h2>");
		out.print("<h2>"+returnValue+"</h2>");
		out.print("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
