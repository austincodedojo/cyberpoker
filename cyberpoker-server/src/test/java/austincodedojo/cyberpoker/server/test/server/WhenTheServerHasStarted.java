package austincodedojo.cyberpoker.server.test.server;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.Collection;

import org.junit.Test;

import austincodedojo.cyberpoker.core.Dealer;

import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.test.framework.JerseyTest;

public class WhenTheServerHasStarted 
	extends JerseyTest {
	@Test
	public void ifHireADealerHasDealer() throws Exception {
		this.client().resource("dealer").put(new Dealer("Fred"));
		Collection<Dealer> dealers = this.client().resource("dealer").get(new GenericType<Collection<Dealer>>() {});
		assertThat(dealers, hasItem(new Dealer("Fred")));
	}
}
