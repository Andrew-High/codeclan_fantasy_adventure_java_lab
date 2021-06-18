package dungeon;

import playerclasses.Player;
import treasure.Gold;
import treasure.ITreasure;
import enemies.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {

    private ArrayList<ITreasure> roomTreasure;
    private ArrayList<Enemy> enemies;
    private ArrayList<Player> deadPlayers;

    public Room(){
        this.roomTreasure = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.deadPlayers = new ArrayList<>();
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

    public ArrayList<Player> getDeadPlayers() {
        return deadPlayers;
    }

    public void setDeadPlayers(ArrayList<Player> deadPlayers) {
        this.deadPlayers = deadPlayers;
    }

    public void addToEnemies(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public void addToTreasure(ITreasure treasure) {
        this.roomTreasure.add(treasure);
    }
}
