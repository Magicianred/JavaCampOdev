package gameDemo;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean iAmNotRobot(Gamer gamer) {
		if (gamer.getNationalIdentity().length() == 11) {
			System.out.println("Robot Testi Ge�ildi: " + gamer.getFirstName());
			return true;
		} else {
			System.out.println("Robot Testi Ge�ilemedi: "  + gamer.getFirstName());
			return false;
		}
	}
}
