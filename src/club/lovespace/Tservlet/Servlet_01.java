package club.lovespace.Tservlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//创建一个servlet模板
public class Servlet_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 访问get请求的东西
		System.out.println("我是doget");
		//在访问doGet方法的同时也访问了DoPost方法
		//this.doPost(request, response);
		
		  String username = request.getParameter("username");
		  
		  //这种方式是处理Get请求的的中文乱码
		  // byte[] getBytes(Charset charset) 
		 // byte[] by =  username.getBytes("ISO-8859-1");
		  //String(byte[] bytes, Charset charset) 
		   //username = new String(by,"utf-8");
		  // System.out.println(username);
		   //--------------------------------------------------------
		  //获取超链接路径上面携带的参数
		   String user = request.getParameter("user");
		   String id = request.getParameter("id");
		   byte[] by =  user.getBytes("ISO-8859-1");
		   user = new String(by,"utf-8");
		   System.out.println(user);
		   System.out.println(id);
		   
		  // this.doPost(request, response);
		   
		   
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//这个编码设置,知识针对post请求提交有效,get请求提交无效
		//这个设置编码的方法要写在doPost方法中的第一行.
		 request.setCharacterEncoding("utf-8");
		// 通过查看api ServletRequst是一个接口
		// 这个接口,是由我们的HttpServletRequest来实现
		// 又由于,我们的dopost这个方法里面传入了HttpServletRquest这个对象
		// 所有我们就可以调用接口里面的方法
		// 什么是接口: 接口就是提供额外的功能 谁要用接口里面的方法,谁就去实现它.

		// post请求的东西
        //这个是获取单个属性
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		//伪代码
		if(username.equals("wang")){
			System.out.println("今天是晴天");
		}else{
			System.out.println("否者是雨天");
		}
		//现在我们要获取多个属性
		 String[] str =    request.getParameterValues("love");
		    // System.out.println(Arrays.asList(str));
		 //我们可以用增强for来进行遍历数组
		 for(String s :str){
			 System.out.println(s);
		 }
		 
		
	}

}