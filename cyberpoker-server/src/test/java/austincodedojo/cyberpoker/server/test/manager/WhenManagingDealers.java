package austincodedojo.cyberpoker.server.test.manager;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

import java.util.Arrays;

import org.junit.Test;

import austincodedojo.cyberpoker.core.Dealer;
import austincodedojo.cyberpoker.server.test.ServerTest;


public class WhenManagingDealers extends ServerTest {

	public WhenManagingDealers() throws Exception {
		super();
	}

	@Test
	public void shouldBeAbleToHireADealer() throws Exception {
		Dealer dealer = new Dealer("Joe");
		
		resource().path("manager").path("dealers").put(dealer);
		Dealer[] dealers = resource().path("manager").path("dealers").get(Dealer[].class);
		
		assertThat(Arrays.asList(dealers), hasItem(equalTo(dealer)));
	}
}
