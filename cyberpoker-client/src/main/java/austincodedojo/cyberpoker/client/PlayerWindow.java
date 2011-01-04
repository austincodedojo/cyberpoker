package austincodedojo.cyberpoker.client;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;


public class PlayerWindow extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1103241992032031422L;
  public static final String MAIN_WINDOW_NAME = "CyberPoker MainWindow";
  public static final String DEALER_LIST = "Dealers:";
  
  public PlayerWindow() {
    super(MAIN_WINDOW_NAME);
    setName(MAIN_WINDOW_NAME);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    
    JList dealerList = new JList(new String[] {"Joe"});
    dealerList.setName(DEALER_LIST);
    
    JScrollPane scrollPane = new JScrollPane(dealerList);
    add(scrollPane);
    
    pack();
  }

  public void display() {
    setVisible(true);
  }
}
