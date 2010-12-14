package austincodedojo.cyberpoker.server.test.manager;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;

import org.junit.Test;

import austincodedojo.cyberpoker.core.Dealer;

import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jmx.remote.opt.util.Service;

public class WhenManagingDealers extends JerseyTest {
	public WhenManagingDealers() throws Exception {
		super("austincodedojo.cyberpoker.server");
	}

	@Test
	public void shouldBeAbleToHireADealer() throws Exception {
		Dealer dealer = new Dealer("Joe");
		
		webResource.path("manager").path("dealers").put(dealer);
		ArrayList<Dealer> dealers = webResource.path("dealers").get(new GenericType<ArrayList<Dealer>>() {});
		
		assertThat(dealers, hasItem(equalTo(dealer)));
	}
}
