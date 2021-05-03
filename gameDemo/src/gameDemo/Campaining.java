package gameDemo;

public class Campaining {
	private int id;
	private int campaingRate;
	 private String name;
	 
	 public Campaining() {
		 
	 }

	 Campaining(int id, int campaingRate, String name) {
		super();
		this.id = id;
		this.campaingRate = campaingRate;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCampaingRate() {
		return campaingRate;
	}

	public void setCampaingRate(int campaingRate) {
		this.campaingRate = campaingRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
