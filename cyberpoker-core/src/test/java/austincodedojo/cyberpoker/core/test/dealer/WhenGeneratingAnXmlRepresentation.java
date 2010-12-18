package austincodedojo.cyberpoker.core.test.dealer;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;



import org.junit.Test;
import org.w3c.dom.Document;

import austincodedojo.cyberpoker.core.Dealer;
import static austincodedojo.cyberpoker.core.test.XmlRepresentationTestUtilities.*;

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
  
  @Test
  public void shouldHaveAVersion() throws Exception {
    Dealer dealer = new Dealer("Joe");
    final String dealerXml = generateXmlRepresentationOf(dealer);
    
    Document parsedDealer = parseEntityXml(dealerXml);
    
    assertThat(parsedDealer, hasXPath("/dealer/@version"));
  }
}
