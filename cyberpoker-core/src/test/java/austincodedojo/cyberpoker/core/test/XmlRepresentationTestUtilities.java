package austincodedojo.cyberpoker.core.test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlRepresentationTestUtilities {
	public static Document parseEntityXml(final String xml)
			throws ParserConfigurationException, SAXException, IOException {
			    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			    Document parsed = builder.parse(new InputSource(new StringReader(xml)));
			    return parsed;
	}

	public static <T> String generateXmlRepresentationOf(T entity)
			throws JAXBException {
			    JAXBContext jc = JAXBContext.newInstance(entity.getClass());
			    Marshaller m = jc.createMarshaller();
			    StringWriter marshalledEntity = new StringWriter();
			    
			    m.marshal(entity, marshalledEntity);
			    final String marshalledDealerAsString = marshalledEntity.toString();
			    return marshalledDealerAsString;
	}

	public static String rootElementTagName(Document parsed) {
	    return parsed.getDocumentElement().getTagName();
	}
}