package austincodedojo.cyberpoker.core.test.dealer;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import austincodedojo.cyberpoker.core.Dealer;


public class WhenGeneratingAnXmlRepresentation {
  @Test
  public void shouldHaveARootXmlElement() throws Exception {
    Dealer dealer = new Dealer();
    final String dealerXml = generateXmlRepresentationOf(dealer);
    
    Document parsedDealer = parseDealerXml(dealerXml);
    assertThat(rootElementTagName(parsedDealer), is("dealer"));
  }
  
  @Test
  public void shouldHaveAName() throws Exception {
    Dealer dealer = new Dealer("Joe");
    final String dealerXml = generateXmlRepresentationOf(dealer);
    
    Document parsedDealer = parseDealerXml(dealerXml);
    assertThat(parsedDealer, hasXPath("/dealer/name", is("Joe")));
  }
  
  @Test
  public void shouldHaveAVersion() throws Exception {
    Dealer dealer = new Dealer("Joe");
    final String dealerXml = generateXmlRepresentationOf(dealer);
    
    Document parsedDealer = parseDealerXml(dealerXml);
    
    assertThat(parsedDealer, hasXPath("/dealer/@version"));
  }

  private Document parseDealerXml(final String dealerXml)
      throws ParserConfigurationException,
        SAXException,
        IOException {
    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    Document parsedDealer = builder.parse(new InputSource(new StringReader(dealerXml)));
    return parsedDealer;
  }

  private String generateXmlRepresentationOf(Dealer dealer) throws JAXBException {
    JAXBContext jc = JAXBContext.newInstance(Dealer.class);
    Marshaller m = jc.createMarshaller();
    StringWriter marshalledDealer = new StringWriter();
    
    m.marshal(dealer, marshalledDealer);
    final String marshalledDealerAsString = marshalledDealer.toString();
    return marshalledDealerAsString;
  }

  private String rootElementTagName(Document parsedDealer) {
    return parsedDealer.getDocumentElement().getTagName();
  }
}
