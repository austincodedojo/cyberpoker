package austincodedojo.cyberpoker.test.acceptance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import austincodedojo.cyberpoker.client.PlayerMain;


public class WhenThePlayerHasConnectedToACasino {
  private static final String CASINO_URL = "http://localhost:8080/cyberpoker-casino";
  private static final String DEALER_NAME = "Joe";
  private Player player;;
  
  @Before
  public void startClient()
  {
	  PlayerMain.main(new String[0]);
	  player = new Player();
  }
  
  @After
  public void stopClient()
  {
	  player.dispose();
  }

  @Test
  public void thePlayerShouldDisplayAListOfDealers() throws Exception {
    CasinoManager casino = new CasinoManager(CASINO_URL);
    casino.hireDealer(DEALER_NAME);
    
    player.setName("Player1");
    player.enterCasino(CASINO_URL);
    casino.waitForPlayer(player);
    
    player.shouldShowDealerNamed(DEALER_NAME);
  }
}
