package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.application.Consultar;

@WebServlet("/listar")
public class ListarServlet extends HttpServlet{


	private static final long serialVersionUID = 7661371151554059409L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		if(id == null) {
			Consultar.getService();
		}else {
			Consultar.getService(id);
		}
	}
}
