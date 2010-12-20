package austincodedojo.cyberpoker.server;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import austincodedojo.cyberpoker.core.*;
import austincodedojo.cyberpoker.server.exception.Bug;

@Path("/manager")
public class CyberpokerServerManager {
	@PUT
	@Path("dealers")
	public void hireDealer(Dealer newDealer)
	{
		
	}
	
	@GET
	@Path("dealers")
	public Dealer[] listDealers()
	{
		Dealer[] dealerList = { new Dealer("Joe") };
		try {
			return dealerList;
		}
		catch (Exception e)
		{
			throw new Bug("Unable to encode dealerList! Reason: " + e.getMessage(), e);
		}
	}
	
	@GET
	@Path("players")
	public Player[] listPlayers()
	{
		Player[] playerList = new Player[0];
		try {
			return playerList;
		}
		catch (Exception e)
		{
			throw new Bug("Unable to encode playerList! Reason: " + e.getMessage(), e);
		}
	}
}
