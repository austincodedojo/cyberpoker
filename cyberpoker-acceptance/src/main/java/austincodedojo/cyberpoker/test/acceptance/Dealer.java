package austincodedojo.cyberpoker.test.acceptance;

public class Dealer {
	private final String dealerName;

	public Dealer(String dealerName) {
		this.dealerName = dealerName;
	}
	
	public String getName()
	{
		return dealerName;
	}
}
