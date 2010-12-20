package austincodedojo.cyberpoker.core;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player {
	@XmlElement
	private String name;
	
	public Player(String name) {
		this.name = name;
	}

	public Player() {
		name = "";
	}

	public String getName()
	{
		return name;
	}
}
