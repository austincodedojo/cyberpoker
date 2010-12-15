package austincodedojo.cyberpoker.core.test.dealer;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import austincodedojo.cyberpoker.core.Dealer;

public class WhenGeneratingATextRepresentation {
	@Test
	public void shouldIncludeTheName() throws Exception {
		Dealer joe = new Dealer("Joe");
		assertThat(joe.toString(), containsString("Joe"));
	}
}
