package gameSalesSimulation;

public class Campaign {
	private int id;
	private String campaignName;
	private float discount; 
	private int campaignStartDate;
	private int expiryTime;
	
	public Campaign(int id, String campaignName, float discount, int campaignStartDate, int expiryTime) {
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.campaignStartDate = campaignStartDate;
		this.expiryTime = expiryTime;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public int getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(int campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}
	public int getExpiryTime() {
		return expiryTime;
	}
	public void setExpiryTime(int expiryTime) {
		this.expiryTime = expiryTime;
	}

}
