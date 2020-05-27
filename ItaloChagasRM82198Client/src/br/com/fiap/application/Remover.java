package br.com.fiap.application;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Remover {

	
	private static Client client = Client.create();
	
	public static int deleteService(int cod) {
				
		WebResource resource = client.resource("http://localhost:8080/ItaloChagasRM82198Server/rest/venda"+cod);
		
		ClientResponse response = resource.delete(ClientResponse.class);
		
		if(response.getStatus() == 204) {
			return response.getStatus();
		}else {
			return response.getStatus();
		}
	}	
	
}
