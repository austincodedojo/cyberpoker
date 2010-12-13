package austincodedojo.cyberpoker.test.acceptance;

import java.net.*;

import org.apache.commons.lang.NotImplementedException;
import java.net.*;

import javax.ws.rs.core.*;

import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.*;
import com.sun.jersey.core.util.*;

/**
 * Connects to the CasinoManagement port of the Casino server to control the
 * server and allow synchronization with Player events.
 * 
 * @author gsymons@gsconsulting.biz
 * 
 */
public class CasinoManager {

	private final CasinoManagerConnection connection;

	public CasinoManager(URL casinoUrl) throws Exception {
		connection = createConnection(casinoUrl);
	}

	public void waitForPlayer(Player player) {
		// TODO Auto-generated method stub
		throw new NotImplementedException(
				"Still need to implement CasinoManager.waitForPlayer()");
	}

	public void hireDealer(String dealerName) {
		connection.hireDealer(new Dealer(dealerName));
	}

	private CasinoManagerConnection createConnection(URL casinoUrl) throws URISyntaxException {
		return new CasinoManagerConnection(casinoUrl);
	}

	public void fireAllDealers() {

	}

}
