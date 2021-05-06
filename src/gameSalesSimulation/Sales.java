package gameSalesSimulation;

public class Sales {
	private int id;
	private String customerName;
	private float price;
	
	public Sales(int id, String customerName, float price) {
		this.id = id;
		this.customerName = customerName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
