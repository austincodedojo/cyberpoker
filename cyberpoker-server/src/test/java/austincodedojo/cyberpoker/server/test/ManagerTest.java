package austincodedojo.cyberpoker.server.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import austincodedojo.cyberpoker.server.test.manager.*;

@RunWith(Suite.class)
@SuiteClasses({WhenManagingDealers.class, WhenManagingPlayers.class})
public class ManagerTest {

}
