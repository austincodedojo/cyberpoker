package austincodedojo.cyberpoker.client;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class PlayerWindow extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1103241992032031422L;
  public static final String PLAYER_NAME_FIELD = "PlayerName";
  public static final String MAIN_WINDOW_NAME = "CyberPoker MainWindow";

  public PlayerWindow() {
    setName(MAIN_WINDOW_NAME);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public void display() {
    setVisible(true);
  }
}
