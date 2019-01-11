package weiyi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import weiyi.control.Conversion;
import weiyi.control.MakeOrderNum;
import weiyi.dao.IDAO;
import weiyi.dao.factory.DAOFactory;
import weiyi.dao.vo.RepairOrders;

/**
 * Servlet implementation class CustomService
 */
@WebServlet("/CustomServlet")
public class CustomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String action= req.getParameter("action");
		if("CreateRepairOrders".equals(action)) {
			RepairOrders vo=new RepairOrders();
			//System.out.println("repairTime的值是"+req.getParameter("repairTime"));
			vo.setOrderId(MakeOrderNum.getOrderNumber());
			Conversion.convert(vo, req);
			IDAO<RepairOrders,String> dao=DAOFactory.getRepairOrders();
			try {
				dao.doCreate(vo);
				PrintWriter out=resp.getWriter();
				out.println("<html>");
				out.println("<head><title>报修成功页面！</title>");
				out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
				out.println("<link rel=\"stylesheet\" href=\"./css/form.css\" /></head>");
				out.println("<body>");
				out.println("<div class='container'><p class='title'>唯e客户服务系统</p>");
				out.println("<div class='box'>	<div id='register_box'>");
				out.println("<h2>报修成功，您的维修单号为："+vo.getOrderId()+"!</h2><br><br><h2>请注意接听电话!</h2><br>");
				out.println("<pre><a href='#'>唯e数码，您身边的电脑专家</a></pre></div></div></div>");//
				out.println("</body></html>");
				//System.out.println("报修成功，您的维修单号为："+vo.getOrderId());
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				System.out.println("CustomService.java文件插入数据出现错误！");
				e.printStackTrace();
			}
		}
		else {
			System.out.println("传参出错！CustomServlet.java文件");
			req.getRequestDispatcher("/UserMainUI.jsp").forward(req, resp);
		}
	}

}
