
public class Main {

	public static void main(String[] args) {
		Player playaOne = new Player();
		playaOne.setAge(35);
		Player playaTwoBetterThanYou = new Player(Position.SHOOTNG_GUARD, "Will be King", 28, 1.95, new Team());
		League lgOne = new League();
		Team tmOne = new Team();
		tmOne.players.add(playaOne);
		tmOne.players.add(playaTwoBetterThanYou);

	}

}
