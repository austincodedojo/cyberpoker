package austincodedojo.cyberpoker.test.acceptance;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.apache.commons.lang.NotImplementedException;

import austincodedojo.cyberpoker.client.PlayerWindow;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JButtonDriver;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JTextFieldDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;

/**
 * Drives a Player GUI using WindowLicker for testing.
 * 
 * @author gsymons@gsconsulting.biz
 *
 */
public class PlayerDriver extends JFrameDriver{

  @SuppressWarnings("unchecked")
  public PlayerDriver() {
	  super(new GesturePerformer(), new AWTEventQueueProber(),
			named(PlayerWindow.MAIN_WINDOW_NAME),
			showingOnScreen());
  }

  public void enterCasino(String casinoUrl) {
	enterTextIntoField(casinoUrl, PlayerWindow.CASINO_FIELD);
	
	@SuppressWarnings("unchecked")
    JButtonDriver enterButton = new JButtonDriver(this, JButton.class, named(PlayerWindow.ENTER_CASINO_BUTTON));
    enterButton.click();
  }

private void enterTextIntoField(String text, String field) {
	@SuppressWarnings("unchecked")
	JTextFieldDriver casinoField = new JTextFieldDriver(this, JTextField.class, named(field));
    casinoField.focusWithMouse();
    casinoField.typeText(text);
    casinoField.hasText(text);
}

  public void shouldShowDealerNamed(String dealerName) {
    // TODO Auto-generated method stub
    throw new NotImplementedException("Still need to implement PlayerDriver.shouldShowDealerNamed()");
  }

  public void setName(String playerName) {
    enterTextIntoField(playerName, PlayerWindow.PLAYER_NAME_FIELD);
  }

public String getName() {
	// TODO Auto-generated method stub
	return null;
}
}
