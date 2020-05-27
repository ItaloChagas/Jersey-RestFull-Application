package br.com.fiap.application;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.VendaTO;

public class Consultar {

	
private static Client client = Client.create();
	
	public static VendaTO[] getService() {
		
		WebResource resource = client.resource("http://localhost:8080/ItaloChagasRM82198Server/rest/venda/");
		
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(response.getStatus() == 200) {

			return response.getEntity(VendaTO[].class);
		}else {
			return null;
		}
	}
	
	public static VendaTO getService(int cod) {
		
		WebResource resource = client.resource("http://localhost:8080/ItaloChagasRM82198Server/rest/venda/"+cod);
		
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(response.getStatus() == 200) {
			return response.getEntity(VendaTO.class);
		}else {
			return null;
		}
	}

}
