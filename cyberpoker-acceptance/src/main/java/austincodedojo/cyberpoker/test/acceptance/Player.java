package austincodedojo.cyberpoker.test.acceptance;

import javax.swing.JTextField;

import org.apache.commons.lang.*;

import austincodedojo.cyberpoker.client.*;

import com.objogate.wl.swing.*;
import com.objogate.wl.swing.driver.*;
import com.objogate.wl.swing.gesture.*;

/**
 * Drives a Player GUI using WindowLicker for testing.
 * 
 * @author gsymons@gsconsulting.biz
 *
 */
public class Player extends JFrameDriver{

  @SuppressWarnings("unchecked")
  public Player() {
	  super(new GesturePerformer(), new AWTEventQueueProber(),
			named(PlayerWindow.MAIN_WINDOW_NAME),
			showingOnScreen());
  }

  public void enterCasino(String casinoUrl) {
    // TODO Auto-generated method stub
    throw new NotImplementedException("Still need to implement PlayerDriver.enterCasino()");
  }

  public void shouldShowDealerNamed(String dealerName) {
    // TODO Auto-generated method stub
    throw new NotImplementedException("Still need to implement PlayerDriver.shouldShowDealerNamed()");
  }

  @SuppressWarnings("unchecked")
  public void setName(String playerName) {
    JTextFieldDriver playerNameField = new JTextFieldDriver(this, JTextField.class, named(PlayerWindow.PLAYER_NAME_FIELD));
    playerNameField.replaceAllText(playerName);
  }
}
