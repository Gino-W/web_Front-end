package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import entity.Employee;

public class RegistServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request接收浏览器请求的对象
		//response服务器端返回响应的对象
		
		//解决乱码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//接收请求的参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//获得响应流
		PrintWriter out = response.getWriter();
		if(username.equals("wxd")){
			//做出响应
			Employee employee = new Employee(1,"wxd",500.0,28);
			String json = JSON.toJSONString(employee);
			out.println(json);
//			out.println("用户名已存在");
		}else{
			out.println("注册成功");
		}
		out.close();
	}
	
}
