package gameDemo;

public class Main {

	public static void main(String[] args) {

		Game game = new Game(2, 400, "Valorant", "War Game");
		game.getId();
		Gamer gamer = new Gamer(1, "Hatice", "K�z�lta�", "0209200", "12345678910");
		gamer.getId();
		Campaining birebir = new Campaining(1,15,"Birebir");
		
		CampainingManager campainingM = new CampainingManager();
		campainingM.add(birebir);
	}

}