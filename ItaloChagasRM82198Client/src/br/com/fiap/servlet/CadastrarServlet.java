package br.com.fiap.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.application.Atualizar;
import br.com.fiap.application.Cadastrar;
import br.com.fiap.to.VendaTO;

@WebServlet("/cadastrar")
public class CadastrarServlet extends HttpServlet{

	private static final long serialVersionUID = 421277005682386596L;

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		
		int id = Integer.parseInt(req.getParameter("id"));
		String nome = req.getParameter("nome");
		double preco = Double.parseDouble(req.getParameter("preco"));
		boolean foiPago = Boolean.parseBoolean(req.getParameter("status"));
		String descricao = req.getParameter("descricao");
		String data = req.getParameter("data");
		
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Calendar dataVenda = Calendar.getInstance();     
	    
	    try {
			dataVenda.setTime(sdf.parse(data));
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
		VendaTO venda = new VendaTO(id, nome, dataVenda, descricao, preco, foiPago);
		
		String retorno = Cadastrar.postService(venda);
		
		resp.sendRedirect(retorno);
		
	}

}
