package br.com.fiap.application;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.VendaTO;

public class Cadastrar {

private static Client client = Client.create();
	
	public static String postService(VendaTO venda) {
		
		WebResource resource = client.resource("http://localhost:8080/ItaloChagasRM82198Server/rest/venda");
		
		ClientResponse response = resource.type("application/json").post(ClientResponse.class, venda);
		
		if(response.getStatus() == 201) {
			return response.toString();
		}else {
			return "Error";
		}
	}
	

}
