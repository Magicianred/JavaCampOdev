package gameDemo;

public interface GameService {
	void sale(Campaining campaining, Gamer gamer, Game game);

	void add(Game game);

	void update(Game game);

	void delete(Game game);
}
