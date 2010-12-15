package austincodedojo.cyberpoker.core;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dealer {
    @XmlAttribute
    private int version = 1;
    
    @XmlElement
	private String name = "";

	public Dealer(String dealerName) {
		this.name = dealerName;
	}
	
	public Dealer() {
    }

	public int getVersion()
	{
	  return version;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (!(other instanceof Dealer)) return false;
		return ((Dealer)other).getName().equals(name);
	}
	
	@Override
	public int hashCode()
	{
		return name.hashCode();
	}
}
