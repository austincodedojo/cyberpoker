package austincodedojo.cyberpoker.core.test;

import java.io.*;

import javax.xml.bind.*;
import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.*;

import austincodedojo.cyberpoker.core.*;

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