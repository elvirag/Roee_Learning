import java.text.MessageFormat;

public class Player {
	private Position pos;
	private String name;
	private int age;
	private double height;
	private Team team;

	public Player(Position pos, String name, int age, double height, Team team) {
		this.pos = pos;
		this.name = name;
		this.age = age;
		this.height = height;
		this.team = team;
	}
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Position getPos() {
		return pos;
	}
	public void setPos(Position pos) {
		this.pos = pos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 18) {
			System.err.println("Age " + age + " is not sufficient");
			System.exit(-1);
		} else if (age > 38) {
			System.err.println(MessageFormat.format("Dude, {0} is too old!", age));
			System.exit(-1);
		}
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}

}
