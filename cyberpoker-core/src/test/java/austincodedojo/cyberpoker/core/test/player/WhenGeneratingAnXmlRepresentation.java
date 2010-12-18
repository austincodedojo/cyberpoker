package austincodedojo.cyberpoker.core.test.player;

import static austincodedojo.cyberpoker.core.test.XmlRepresentationTestUtilities.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.w3c.dom.*;

import austincodedojo.cyberpoker.core.*;

public class WhenGeneratingAnXmlRepresentation {
	@Test
	public void shouldHaveARootXmlElement() throws Exception {
		Player player = new Player();
		final String playerXml = generateXmlRepresentationOf(player);
		
		Document parsedPlayer = parseEntityXml(playerXml);
		
		assertThat(rootElementTagName(parsedPlayer), is("player"));
	}
	
	@Test
	public void shouldHaveAName() throws Exception {
		Player player = new Player("Player1");
		final String playerXml = generateXmlRepresentationOf(player);
		
		Document parsedPlayer = parseEntityXml(playerXml);
		
		assertThat(parsedPlayer, hasXPath("/player/name", is("Player1")));
	}
}
