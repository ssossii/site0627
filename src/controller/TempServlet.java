package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;

public class TempServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user=request.getParameter("user");
		String phone=request.getParameter("phone");
		
		User dto = new User();
		dto.setUser(user);
		dto.setPhone(phone);
		//dto�� ���� �ٸ� �������� �������� ������?
		//without session, application
		
		//���� �� ��û�� ���� ������ �ǽ����� ����, ������ �ִ�
		//result.jsp�� ������ ��Ű��
		RequestDispatcher dis=null;
		dis=request.getRequestDispatcher("/scope2/result.jsp");
		
		//��û��ü�� ���ϴ� ������ �ɾ��
		//request ��ü�� ���� �ʴ� ���ȿ��� �����͸� ���� �����ִ�
		request.setAttribute("dto", dto);
		
		//�������ϱ�!
		dis.forward(request, response);

	}
}
