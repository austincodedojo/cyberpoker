package austincodedojo.cyberpoker.client;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class PlayerWindow extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1103241992032031422L;
  public static final String PLAYER_NAME_FIELD = "Player Name:";
  public static final String MAIN_WINDOW_NAME = "CyberPoker MainWindow";
  public static final String CASINO_FIELD = "Casino URL:";
  public static final String ENTER_CASINO_BUTTON = "Enter Casino";
  
  private final JTextField playerName;
  private final JTextField casino;

  public PlayerWindow() {
    super(MAIN_WINDOW_NAME);
    setName(MAIN_WINDOW_NAME);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    
    JPanel formFields = new JPanel(new GridLayout(0, 2));
    formFields.add(new JLabel(PLAYER_NAME_FIELD));
    playerName = new JTextField(20);
    playerName.setName(PLAYER_NAME_FIELD);
    formFields.add(playerName);
    
    formFields.add(new JLabel(CASINO_FIELD));
    casino = new JTextField(20);
    casino.setName(CASINO_FIELD);
    formFields.add(casino);
    
    add(formFields);
    
    JPanel enterCasinoPanel = new JPanel();
    JButton enterCasino = new JButton(ENTER_CASINO_BUTTON);
    enterCasino.setName(ENTER_CASINO_BUTTON);
    enterCasinoPanel.add(enterCasino);
    
    add(enterCasinoPanel);
    
    pack();
  }

  public void display() {
    setVisible(true);
  }
}
