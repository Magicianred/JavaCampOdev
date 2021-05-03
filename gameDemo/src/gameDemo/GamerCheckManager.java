package gameDemo;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean iAmNotRobot(Gamer gamer) {
		if (gamer.getNationalIdentity().length() == 11) {
			System.out.println("Robot Testi Geçildi: " + gamer.getFirstName());
			return true;
		} else {
			System.out.println("Robot Testi Geçilemedi: "  + gamer.getFirstName());
			return false;
		}
	}
}
