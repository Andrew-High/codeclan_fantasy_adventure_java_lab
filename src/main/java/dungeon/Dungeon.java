package dungeon;

import treasure.*;

import java.util.ArrayList;
import java.util.Random;

public class Dungeon {

    private ArrayList<Room> rooms;
    private Room room;
    private ArrayList<ITreasure> temporaryLootList;
    private Random random;
    private ArrayList<Integer> randomList;
    private Weapon weapon;

    public Dungeon () {
        this.rooms = new ArrayList<>();
        this.rooms.add(room);
        this.rooms.add(room);
        this.rooms.add(room);
        this.rooms.add(room);
        this.rooms.add(room);
        this.temporaryLootList = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Weapon randomWeaponGenerator() {
        int randomNumber = random.nextInt(10);
        if (randomNumber > 8) {
            return weapon = new Weapon(WeaponType.AXE);
        } else if (randomNumber > 7) {
            return weapon = new Weapon(WeaponType.WAND);
        } else if (randomNumber > 5) {
            return weapon = new Weapon(WeaponType.MACE);
        } else if (randomNumber > 4) {
            return weapon = new Weapon(WeaponType.LONGSWORD);
        } else if (randomNumber > 3) {
            return weapon = new Weapon(WeaponType.STAFF);
        } else if (randomNumber > 1) {
            return weapon = new Weapon(WeaponType.SHORTSWORD);
        } else {
            return weapon = new Weapon(WeaponType.VORPALSWORD);
        }
    }


    public void populateLootList() {
        randomList.add(random.nextInt(10));
        randomList.add(random.nextInt(10));
        randomList.add(random.nextInt(10));
        randomList.add(random.nextInt(10));
        randomList.add(random.nextInt(10));
        randomList.add(random.nextInt(10));
        randomList.add(random.nextInt(10));
        randomList.add(random.nextInt(10));
        randomList.add(random.nextInt(10));
        randomList.add(random.nextInt(10));
        for (Integer number : randomList){
            if (number > 6){
                Gold gold = new Gold();
                this.temporaryLootList.add(gold);
            } else if (number > 3){
                Gem gem = new Gem();
                this.temporaryLootList.add(gem);
            } else {
                this.temporaryLootList.add(randomWeaponGenerator());
            }
        }
    }

    public void setUpRoomEnemies() {
        ArrayList <Integer> randomRoomIndexArray = new ArrayList<>();
        int randomRoomIndex1;
        randomRoomIndexArray.add(randomRoomIndex1 = random.nextInt(this.rooms.size()));
        int randomRoomIndex2;
        randomRoomIndexArray.add(randomRoomIndex2 = random.nextInt(this.rooms.size()));
        int randomRoomIndex3;
        randomRoomIndexArray.add(randomRoomIndex3 = random.nextInt(this.rooms.size()));
        int randomRoomIndex4;
        randomRoomIndexArray.add(randomRoomIndex4 = random.nextInt(this.rooms.size()));
        int randomRoomIndex5;
        randomRoomIndexArray.add(randomRoomIndex5 = random.nextInt(this.rooms.size()));
        int randomRoomIndex6;
        randomRoomIndexArray.add(randomRoomIndex6 = random.nextInt(this.rooms.size()));
        int randomRoomIndex7;
        randomRoomIndexArray.add(randomRoomIndex7 = random.nextInt(this.rooms.size()));
        int randomRoomIndex8;
        randomRoomIndexArray.add(randomRoomIndex8 = random.nextInt(this.rooms.size()));
        int randomRoomIndex9;
        randomRoomIndexArray.add(randomRoomIndex9 = random.nextInt(this.rooms.size()));
        int randomRoomIndex10;
        randomRoomIndexArray.add(randomRoomIndex10 = random.nextInt(this.rooms.size()));
        this.temporaryLootList.forEach(item -> this.rooms.get(randomRoomIndexArray.get(temporaryLootList.indexOf(item))).getEnemies().get(0).addTreasureToLoot(item));

    }
}
