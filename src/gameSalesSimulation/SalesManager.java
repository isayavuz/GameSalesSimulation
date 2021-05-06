package gameSalesSimulation;

public class SalesManager implements SalesService {
	@Override
	public void buy(Customer customer, Game game) {
		System.out.println(game.getNameOfTheGame()+" oyunu "+customer.getFirstName() +" ki�isine "+game.getPrice()+"TL fiyat kar��l���nda sat�ld�.");
		
	}

	@Override
	public void buyCampaign(Customer customer, Game game, Campaign campaign) {
		System.out.println(game.getNameOfTheGame()+" oyunu "+customer.getFirstName() +" ki�isine "+( game.getPrice()-campaign.getDiscount() )+"TL fiyat kar��l���nda sat�ld�.");
		
	}

}
