package austincodedojo.cyberpoker.test.acceptance;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import austincodedojo.cyberpoker.core.Dealer;
import austincodedojo.cyberpoker.core.Player;
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

	public void waitForPlayer(PlayerDriver driver) throws InterruptedException {
		long timeout = System.currentTimeMillis() + 1000;
		Player[] players = new Player[0];
		while(System.currentTimeMillis() < timeout && !hasItem(hasProperty("name", equalTo(driver.getName()))).matches(players));
		{
			players = connection.listPlayers();
			Thread.sleep(100);
		}
		
		ArrayList<Object> playerObjs= new ArrayList<Object>();
		playerObjs.add(players);
		assertThat(playerObjs, hasItem(hasProperty("name", equalTo(driver.getName()))));
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
