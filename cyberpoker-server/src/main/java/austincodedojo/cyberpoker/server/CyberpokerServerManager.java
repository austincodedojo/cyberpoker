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
		return dealerList;
	}
	
	@GET
	@Path("players")
	public Player[] listPlayers()
	{
		Player[] playerList = new Player[0];
		return playerList;
	}
}
