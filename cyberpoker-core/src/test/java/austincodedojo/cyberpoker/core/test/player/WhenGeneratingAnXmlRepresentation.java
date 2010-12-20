package austincodedojo.cyberpoker.core.test.player;

import static austincodedojo.cyberpoker.core.test.XmlRepresentationTestUtilities.generateXmlRepresentationOf;
import static austincodedojo.cyberpoker.core.test.XmlRepresentationTestUtilities.parseEntityXml;
import static austincodedojo.cyberpoker.core.test.XmlRepresentationTestUtilities.rootElementTagName;
import static org.hamcrest.Matchers.hasXPath;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.w3c.dom.Document;

import austincodedojo.cyberpoker.core.Player;

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
