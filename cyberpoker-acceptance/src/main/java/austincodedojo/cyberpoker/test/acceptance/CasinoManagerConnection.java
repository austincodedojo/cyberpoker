package austincodedojo.cyberpoker.test.acceptance;

import java.net.*;

import javax.ws.rs.core.*;

import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.*;
import com.sun.jersey.core.util.*;

public class CasinoManagerConnection {
	final ClientConfig config;
	final Client client;
	final WebResource service;
	
	public CasinoManagerConnection(URL casinoUrl) throws URISyntaxException {
		config = new DefaultClientConfig();
		client = Client.create(config);
		service = client.resource(casinoUrl.toURI()).path("manager");
	}

	public void createDealer(Dealer dealer) {
		final MultivaluedMap<String, String> serializedDealer = new MultivaluedMapImpl();
		serializedDealer.add("name", dealer.getName());
		
		try {
			service.path("dealers").put(serializedDealer);
		} catch (Exception e) {
			throw new RecalcitrantManager("Unable to create dealer named \"" + dealer.getName() + "\" because: " + e.getMessage(), e);
		}
	}
}
