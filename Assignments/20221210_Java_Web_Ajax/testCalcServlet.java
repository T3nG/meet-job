

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/testCalc")
public class testCalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String number1=request.getParameter("number1");
		String number2=request.getParameter("number2");
		String operator=request.getParameter("operator");
		
		double result = 0, n1 = 0, n2 = 0;
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		n1=Double.parseDouble(number1);
		n2=Double.parseDouble(number2);
		
		if (operator.equals("add")){
			result = n1 + n2;
		}
		else if(operator.equals("sub")){
			result = n1 - n2;
		}
		else if(operator.equals("mul")){
			result = n1 * n2;
		}
		else{
			result = n1 / n2;
		}
		out.print(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
