package gameSalesSimulation;

public class CampaignManager implements CampaignService {
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� silindi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� g�ncellendi.");
	}

}
