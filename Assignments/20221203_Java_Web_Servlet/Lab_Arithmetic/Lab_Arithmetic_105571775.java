
import java.io.IOException;
import java.io.PrintWriter;

//Tomcat 9
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

//Tomcat 10.0
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Arithmetic")
public class Lab_Arithmetic_105571775 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String number1=request.getParameter("number1");
		String number2=request.getParameter("number2");
		String operator=request.getParameter("operator");
		
		String returnMessage = "";
		double n1 = 0; 
		double n2 = 0;
		double returnValue = 0;
		boolean check = true;
		
		if (operator.equals("nul")) {
			check = false;
			returnMessage = "運算符號未選取";
		}
		
		while (check) {
			try {
			    n1 = Double.parseDouble(number1);
			} catch (NumberFormatException e) {
			    check = false;
			    returnMessage = "數值1錯誤";
			}
		
			try {
			    n2 = Double.parseDouble(number2);
			    break;
			} catch (NumberFormatException e) {
			    check = false;
			    if (returnMessage.equals("數值1錯誤"))
			    	returnMessage = "數值1與數值2錯誤";
			    else
			    	returnMessage = "數值2錯誤";
			}
		}
	
		if(check) {
			switch(operator) {
				case "add":
					returnValue = n1 + n2;
					break;
				case "sub":
					returnValue = n1 - n2;
					break;
				case "mul":
					returnValue = n1 * n2;
					break;
				case "div":
					if(n2 == 0) {
						returnMessage = "除數不能為 0";
						check = false;
					}
					else {
						returnValue = n1 / n2;
					}
					break;
			}
		}
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>計算結果</title></head>");
		out.println("<body>");
		if (check)
			out.println("<h1>計算結果: " + returnValue +"</h1>");
		else
			out.println("<h1>錯誤: " + returnMessage + "</h1>");
		out.println("</body></html>");		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
