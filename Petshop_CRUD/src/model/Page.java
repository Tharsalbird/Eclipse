package model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

public class Page extends HttpServlet {

	private void sendPageHeader(HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Cadastrar Pessoa</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<CENTER>");
	}

	private void sendPageFooter(HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("</CENTER>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

}
