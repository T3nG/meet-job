
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.ted.UserInfoBean;


@WebServlet("/doUseBean")
public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
            
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("utf-8");

        // 建立 userInfo 物件，並指定一個 session 的 attribute 與之繫結
        UserInfoBean userInfo = new UserInfoBean();
        userInfo.setUserName("孫中山");
        HttpSession session = request.getSession();
        session.setAttribute("userInfo", userInfo);

        // 前往指定的網頁
        RequestDispatcher disp;
        disp = request.getRequestDispatcher("HelloJSP.jsp");
        disp.forward(request, response);
    }
}
