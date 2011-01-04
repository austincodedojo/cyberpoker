package austincodedojo.cyberpoker.test.acceptance;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import austincodedojo.cyberpoker.client.ClientMain;


public class WhenThePlayerHasConnectedToACasino {
  private static final String CASINO_URL = "http://localhost:8080/cyberpoker-casino";
  private static final String DEALER_NAME1 = "Joe";
  private static final String DEALER_NAME2 = "Bill";
  private PlayerDriver player;
  private CasinoManager casino;
  
  @Before
  public void startClient() throws Exception
  {
	  ClientMain.main(new String[0]);
	  casino = new CasinoManager(new URL(CASINO_URL));
	  player = new PlayerDriver();
  }
  
  @After
  public void stopClient()
  {
	  player.dispose();
  }

  @Test
  public void thePlayerShouldDisplayAListOfDealers() throws Exception {
    casino.hireDealer(DEALER_NAME1);
    player.shouldSeeADealerNamed(DEALER_NAME1);
  }
  @Test
  public void thePlayerShouldDisplayOnlyTheHiredDealer() throws Exception {
    casino.hireDealer(DEALER_NAME2);
    player.shouldSeeADealerNamed(DEALER_NAME2);
    player.shouldNotSeeADealerNamed(DEALER_NAME1);
  }
}
