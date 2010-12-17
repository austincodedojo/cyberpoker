package austincodedojo.cyberpoker.server.manager;

import java.net.*;

import javax.ws.rs.core.*;


import austincodedojo.cyberpoker.core.Dealer;
import austincodedojo.cyberpoker.core.Player;
import austincodedojo.cyberpoker.server.manager.exception.RecalcitrantManagerGrumbling;

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

	public void hireDealer(Dealer dealer) {
		try {
			service.path("dealers").put(dealer);
		} catch (Exception e) {
			throw new RecalcitrantManagerGrumbling("I don't want to hire the dealer named \"" + dealer.getName() + "\" because: " + e.getMessage(), e);
		}
	}

	public Player[] listPlayers() {
		try {
			return service.path("players").get(Player[].class);
		}
		catch (Exception e) {
			throw new RecalcitrantManagerGrumbling("I don't want to tell you about the connected players because: " + e.getMessage(), e);
		}
	}
}
