package austincodedojo.cyberpoker.test.acceptance;

import org.apache.commons.lang.NotImplementedException;
import java.net.*;

/**
 * Connects to the CasinoManagement port of the Casino server to control the 
 * server and allow synchronization with Player events.
 * 
 * @author gsymons@gsconsulting.biz
 *
 */
public class CasinoManager {

	private final URL casinoUrl;

	public CasinoManager(URL casinoUrl) throws MalformedURLException {
		this.casinoUrl = new URL(casinoUrl, "manager");
	}

	public void waitForPlayer(Player player) {
		// TODO Auto-generated method stub
		throw new NotImplementedException(
				"Still need to implement CasinoManager.waitForPlayer()");
	}

	public void hireDealer(String dealerName) throws URISyntaxException {
	}

	public void fireAllDealers() {

	}

}
