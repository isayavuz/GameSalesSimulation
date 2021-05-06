package gameSalesSimulation;

public class Game {
	private int id;
	private String nameOfTheGame;
	private String category;
	private int releaseDate;
	private float price;
	
	public Game(int id, String nameOfTheGame, String category, int releaseDate, float price) {
		this.id = id;
		this.nameOfTheGame = nameOfTheGame;
		this.category = category;
		this.releaseDate = releaseDate;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfTheGame() {
		return nameOfTheGame;
	}

	public void setNameOfTheGame(String nameOfTheGame) {
		this.nameOfTheGame = nameOfTheGame;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
