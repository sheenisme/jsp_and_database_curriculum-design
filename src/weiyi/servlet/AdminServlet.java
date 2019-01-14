package weiyi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import weiyi.control.Conversion;
import weiyi.control.EncryptImp;
import weiyi.dao.IDAO;
import weiyi.dao.factory.DAOFactory;
import weiyi.dao.vo.Admin;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String action= request.getParameter("action");
		
		//如果是要修改管理员的信息
		if("AdminUpdate".equals(action)) {
			Admin vo=new Admin();
			Conversion.convert(vo, request);
			IDAO<Admin,Integer> dao=DAOFactory.getAdmin();
			vo.setPassword(new EncryptImp().md5(vo.getPassword()));
			try {
				if(dao.doUpdate(vo) < 0){
					System.out.println("AdminServlet.java修改账户信息失败，失败原因：dao.doUpdate(vo)<0！");
					request.getRequestDispatcher("/ReviseAdmin.jsp").forward(request, response);
				}else {
					PrintWriter out=response.getWriter();
				    out.println("<html>");  
				    out.println("<script>");  
				    out.println("window.open ('/weiyinetclient/AdminLogin.jsp','_top')");  
				    out.println("</script>");  
				    out.println("</html>");  
				}
			} catch (Exception e) {
				System.out.println("捕获到异常！源于：AdminServlet.java文件修改管理员信息出现错误！- dao.doUpdate(vo)产生异常信息！");
				e.printStackTrace();
			}
			
		}
	}

}
