package austincodedojo.cyberpoker.server.test.manager;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import austincodedojo.cyberpoker.core.Player;
import austincodedojo.cyberpoker.server.test.ServerTest;

import com.sun.jersey.api.client.WebResource;

public class WhenManagingPlayers extends ServerTest {

	public WhenManagingPlayers() throws Exception {
		super();
	}
	
	public WebResource resource() {
		return super.resource().path("manager").path("players");
	}
	
	@Test
	public void shouldReturnAnEmptyPlayerListWhenThereAreNoPlayers() throws Exception {
		Player[] players = resource().get(Player[].class);
		assertThat(players.length, is(0));
	}
}
