package treasure;

public enum WeaponType {
    LONGSWORD(10),
    SHORTSWORD(5),
    AXE(10),
    MACE(10),
    WAND(10),
    STAFF(10),
    VORPALSWORD(100);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
