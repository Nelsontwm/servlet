package club.lovespace.Tservlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//����һ��servletģ��
public class Servlet_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ����get����Ķ���
		System.out.println("����doget");
		//�ڷ���doGet������ͬʱҲ������DoPost����
		//this.doPost(request, response);
		
		  String username = request.getParameter("username");
		  
		  //���ַ�ʽ�Ǵ���Get����ĵ���������
		  // byte[] getBytes(Charset charset) 
		 // byte[] by =  username.getBytes("ISO-8859-1");
		  //String(byte[] bytes, Charset charset) 
		   //username = new String(by,"utf-8");
		  // System.out.println(username);
		   //--------------------------------------------------------
		  //��ȡ������·������Я���Ĳ���
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
		//�����������,֪ʶ���post�����ύ��Ч,get�����ύ��Ч
		//������ñ���ķ���Ҫд��doPost�����еĵ�һ��.
		 request.setCharacterEncoding("utf-8");
		// ͨ���鿴api ServletRequst��һ���ӿ�
		// ����ӿ�,�������ǵ�HttpServletRequest��ʵ��
		// ������,���ǵ�dopost����������洫����HttpServletRquest�������
		// �������ǾͿ��Ե��ýӿ�����ķ���
		// ʲô�ǽӿ�: �ӿھ����ṩ����Ĺ��� ˭Ҫ�ýӿ�����ķ���,˭��ȥʵ����.

		// post����Ķ���
        //����ǻ�ȡ��������
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		//α����
		if(username.equals("wang")){
			System.out.println("����������");
		}else{
			System.out.println("����������");
		}
		//��������Ҫ��ȡ�������
		 String[] str =    request.getParameterValues("love");
		    // System.out.println(Arrays.asList(str));
		 //���ǿ�������ǿfor�����б�������
		 for(String s :str){
			 System.out.println(s);
		 }
		 
		
	}

}