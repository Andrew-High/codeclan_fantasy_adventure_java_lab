public abstract class Player extends Character{

    private int strength;
    private int intelligence;
    private String name;
    private Race race;

    public Player(int hitPoints, int stamina, int strength, int intelligence, Race race) {
        super(hitPoints, stamina);
        this.strength = strength;
        this.intelligence = intelligence;
        this.race = race;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }
}
