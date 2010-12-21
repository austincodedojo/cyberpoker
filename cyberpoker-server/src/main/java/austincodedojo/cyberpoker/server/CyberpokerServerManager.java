package austincodedojo.cyberpoker.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import austincodedojo.cyberpoker.core.Dealer;

@Path("/manager")
public class CyberpokerServerManager {
	@GET
	@Path("dealers")
	public Dealer[] listDealers()
	{
		Dealer[] dealerList = { new Dealer("Joe") };
		return dealerList;
	}
}
