package br.com.fiap.application;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.VendaTO;

public class Atualizar {
	private static Client client = Client.create();
	
	public static int putService(VendaTO venda) {
				
		System.out.println("CODIGO PRODUTO " +venda.getCodigo());
		WebResource resource = client.resource("http://localhost:8080/ItaloChagasRM82198Server/rest/venda/"+venda.getCodigo());
		
		ClientResponse response = resource.type("application/json").put(ClientResponse.class, venda);
		
		if(response.getStatus() == 200) {
			return response.getStatus();
		}else {
			return response.getStatus();
		}
	}	
}