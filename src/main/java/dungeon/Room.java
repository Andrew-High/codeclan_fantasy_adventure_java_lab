package dungeon;

public class Room {

    private ArrayList<ITreasure> roomTreasure;
    private ArrayList<Enemy> enemies;

    public Room(){
        this.roomTreasure = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public ArrayList<ITreasure> getRoomTreasure() {
        return roomTreasure;
    }

    public void setRoomTreasure(ArrayList<ITreasure> roomTreasure) {
        this.roomTreasure = roomTreasure;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public void addToEnemies(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public void addToTreasure(ITreasure treasure) {
        this.roomTreasure.add(treasure);
    }
}
