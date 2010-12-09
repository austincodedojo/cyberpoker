package austincodedojo.cyberpoker.test.acceptance;

import static org.junit.Assert.*;

import org.junit.Test;


public class WhenThePlayerHasConnectedToACasino {
  private static final String CASINO_URL = "http://localhost:8080/cyberpoker-casino";
  private static final String DEALER_NAME = "Joe";

  @Test
  public void thePlayerShouldDisplayAListOfDealers() throws Exception {
    PlayerDriver player = new PlayerDriver("Player1");
    CasinoManager casino = new CasinoManager(CASINO_URL);
    casino.hireDealer(DEALER_NAME);
    
    player.enterCasino(CASINO_URL);
    casino.waitForPlayer(player);
    
    player.shouldShowDealerNamed(DEALER_NAME);
  }
}
