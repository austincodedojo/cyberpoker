package austincodedojo.cyberpoker.test.acceptance;

import java.net.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import austincodedojo.cyberpoker.client.ClientMain;


public class WhenThePlayerHasConnectedToACasino {
  private static final String CASINO_URL = "http://localhost:8080/cyberpoker-casino";
  private static final String DEALER_NAME = "Joe";
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
	  casino.fireAllDealers();
  }

  @Test
  public void thePlayerShouldDisplayAListOfDealers() throws Exception {
    casino.hireDealer(DEALER_NAME);
    
    player.setName("Player1");
    player.enterCasino(CASINO_URL);
    casino.waitForPlayer(player);
    
    player.shouldShowDealerNamed(DEALER_NAME);
  }
}
