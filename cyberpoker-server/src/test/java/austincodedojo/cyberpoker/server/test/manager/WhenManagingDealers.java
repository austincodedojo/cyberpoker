package austincodedojo.cyberpoker.server.test.manager;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

import java.util.Arrays;

import org.junit.Test;

import austincodedojo.cyberpoker.core.Dealer;

import com.sun.jersey.test.framework.JerseyTest;

public class WhenManagingDealers extends JerseyTest {
	public WhenManagingDealers() throws Exception {
		super("austincodedojo.cyberpoker.server");
	}

	@Test
	public void shouldBeAbleToHireADealer() throws Exception {
		Dealer dealer = new Dealer("Joe");
		
		webResource.path("manager").path("dealers").put(dealer);
		Dealer[] dealers = webResource.path("manager").path("dealers").get(Dealer[].class);
		
		assertThat(Arrays.asList(dealers), hasItem(equalTo(dealer)));
	}
}
