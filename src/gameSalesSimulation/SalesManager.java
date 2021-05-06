package gameSalesSimulation;

public class SalesManager implements SalesService {
	@Override
	public void buy(Customer customer, Game game) {
		System.out.println(game.getNameOfTheGame()+" oyunu "+customer.getFirstName() +" kiþisine "+game.getPrice()+"TL fiyat karþýlýðýnda satýldý.");
		
	}

	@Override
	public void buyCampaign(Customer customer, Game game, Campaign campaign) {
		System.out.println(game.getNameOfTheGame()+" oyunu "+customer.getFirstName() +" kiþisine "+( game.getPrice()-campaign.getDiscount() )+"TL fiyat karþýlýðýnda satýldý.");
		
	}

}
