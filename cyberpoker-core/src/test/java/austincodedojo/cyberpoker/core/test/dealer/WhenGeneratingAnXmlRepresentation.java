package austincodedojo.cyberpoker.core.test.dealer;

import static austincodedojo.cyberpoker.core.test.XmlRepresentationTestUtilities.generateXmlRepresentationOf;
import static austincodedojo.cyberpoker.core.test.XmlRepresentationTestUtilities.parseEntityXml;
import static austincodedojo.cyberpoker.core.test.XmlRepresentationTestUtilities.rootElementTagName;
import static org.hamcrest.Matchers.hasXPath;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.w3c.dom.Document;

import austincodedojo.cyberpoker.core.Dealer;

public class WhenGeneratingAnXmlRepresentation {
  @Test
  public void shouldHaveARootXmlElement() throws Exception {
    Dealer dealer = new Dealer();
    final String dealerXml = generateXmlRepresentationOf(dealer);
    
    Document parsedDealer = parseEntityXml(dealerXml);
    assertThat(rootElementTagName(parsedDealer), is("dealer"));
  }
  
  @Test
  public void shouldHaveAName() throws Exception {
    Dealer dealer = new Dealer("Joe");
    final String dealerXml = generateXmlRepresentationOf(dealer);
    
    Document parsedDealer = parseEntityXml(dealerXml);
    assertThat(parsedDealer, hasXPath("/dealer/name", is("Joe")));
  }
}
