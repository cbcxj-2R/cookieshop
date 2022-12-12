package servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import model.User;
import service.UserService;

/**
 * Servlet implementation class UserRegistServlet
 */
@WebServlet({ "/UserRegistServlet", "/user_regist" })
public class UserRegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService us = new UserService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//1
		User user = new User();
		try {
			BeanUtils.copyProperties(user, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2
		
		
		//3
		boolean flag = us.regist(user);
		
		//4
		if(flag) {
			request.setAttribute("msg", "×¢²á³É¹¦£¬µÇÂ¼");
			request.getRequestDispatcher("/user_login.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "×¢²áÊ§°Ü£¬ÖØÊÔ");
			request.getRequestDispatcher("/user_register.jsp").forward(request, response);
		
		}
	}

}
