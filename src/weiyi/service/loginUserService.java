package weiyi.service;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import weiyi.dao.proxy.UserDAOProxy;
import weiyi.dao.vo.User;

/**
 * Servlet implementation class UserServiceImp
 */
/**
 * 实现登录的servlet类
 * @author 广辉
 *
 */
@WebServlet("/Login")
public class loginUserService extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginUserService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());\
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		UserDAOProxy userdao = null;
		String name=req.getParameter("username");
		String pass=req.getParameter("password");
		User user=new User();
		
		try {
			userdao = new UserDAOProxy();
			user=userdao.findByName(name);
			if(user==null) {
				System.out.println("登录失败！");
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			}else {
				String md5=user.getPassword();
				if(!userdao.getMD5(pass).equals(md5) || md5==""){
					System.out.println("登录失败！");
					req.getRequestDispatcher("/login.jsp").forward(req, resp);
				}
				else{
					//System.out.println("登陆成功！");
					
					req.getRequestDispatcher("/user_page.jsp").forward(req, resp);
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}