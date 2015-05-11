package model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PersonPage extends Page{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super();
		sendPageHeader(response);
		sendPageFooter(response);
		sendCadastreForm(request, response);

	}

	private void sendCadastreForm(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{
		
		PrintWriter out = response.getWriter();
		out.println("<div id=\"personForm\">");
		out.println("Nome: <input type=\"text\" name=\"nome\" /><br />");
		out.println("Email: <input type=\"text\" name=\"email\" /><br /> ");
		out.println("Endereço: <input type=\"text\" name=\"endereco\" /><br />");
		out.println("CPF: <input type=\"text\" name=\"cpf\" /><br /> <br />");
		out.println("<input type=\"submit\" value= \"Proximo\" />");
		out.println("</div");
	}

}
