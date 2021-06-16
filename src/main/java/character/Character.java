package character;

public abstract class Character {
    private int hitPoints;
    private int stamina;

    public Character(int hitPoints, int stamina) {
        this.hitPoints = hitPoints;
        this.stamina = stamina;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
