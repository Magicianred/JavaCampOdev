package gameDemo;

public class CampainingManager  implements CampainingService{
	@Override
	public void add(Campaining campaining) {
		System.out.println("Kampanya Eklendi "  + campaining.getName());

	}

	@Override
	public void delete(Campaining campaining) {
		
		System.out.println("Kampanya Silindi "  + campaining.getName());
	}

	@Override
	public void update(Campaining campaining) {
		System.out.println("Kampanya Güncellendi "  + campaining.getName());

	}
}
