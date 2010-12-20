package austincodedojo.cyberpoker.server.test.manager;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

import org.junit.*;

import com.sun.jersey.api.client.*;

import austincodedojo.cyberpoker.core.*;
import austincodedojo.cyberpoker.server.*;
import austincodedojo.cyberpoker.server.test.*;

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
