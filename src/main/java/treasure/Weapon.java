package treasure;

public class Weapon implements ITreasure {
    private WeaponType type;

    public Weapon(WeaponType type){
        this.type = type;
    }

    public int getDamageFromEnum(){
        return this.type.getDamage();
    }
}
