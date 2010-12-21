package austincodedojo.cyberpoker.test.acceptance;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.apache.commons.lang.NotImplementedException;

import austincodedojo.cyberpoker.client.PlayerWindow;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.ComponentSelector;
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

	public void shouldSeeADealerNamed(String dealerName) {
		// TODO Auto-generated method stub
		throw new NotImplementedException("Still need to implement PlayerDriver.shouldShowDealerNamed()");
	}
}
