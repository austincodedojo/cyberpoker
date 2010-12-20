package austincodedojo.cyberpoker.core.test.dealer;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import austincodedojo.cyberpoker.core.Dealer;

public class WhenGeneratingATextRepresentation {
	@Test
	public void shouldIncludeTheName() throws Exception {
		Dealer joe = new Dealer("Joe");
		assertThat(joe.toString(), containsString("Joe"));
	}
}
