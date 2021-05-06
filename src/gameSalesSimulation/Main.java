package gameSalesSimulation;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1,"isa", "yavuz", 1997, "1234");
		CustomerManager customerManager=new CustomerManager(new CustomerValidationManager());
		SalesManager salesManager=new SalesManager();
		CampaignManager campaignManager=new CampaignManager();
		
		Game game1=new Game(1, "ETS2", "simulator", 2012,200);
		Game game2=new Game(2, "word of tanks", "warfare", 2015,450);
		Campaign campaign=new Campaign(1, "Ýlkbahar indirimleri", 75, 2021, 2021);
		
		
		customerManager.add(customer);
		customerManager.delete(customer);
		
		campaignManager.add(campaign);
		
		salesManager.buy(customer, game1);
		salesManager.buyCampaign(customer, game2, campaign);

	}

}
