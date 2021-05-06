package gameSalesSimulation;

public interface SalesService {
	void buy(Customer customer, Game game);
	void buyCampaign(Customer customer, Game game, Campaign campaign);
}
