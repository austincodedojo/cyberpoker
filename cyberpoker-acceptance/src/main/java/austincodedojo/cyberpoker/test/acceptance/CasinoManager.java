package austincodedojo.cyberpoker.test.acceptance;

import java.net.URISyntaxException;
import java.net.URL;

import org.apache.commons.lang.NotImplementedException;

import austincodedojo.cyberpoker.core.Dealer;
import austincodedojo.cyberpoker.server.manager.CasinoManagerConnection;

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

	public void waitForPlayer(PlayerDriver driver) {
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
