package it.morfoza;

/**
 * Created by Wojt on 2016-08-15.
 */
public class Room {

    int playerCoordinateX = 2;
    int playerCoordinateY = 4;
    int monsterCoordinateX = (int) (Math.random() * 10) / 2;
    int monsterCoordinateY = (int) (Math.random() * 10) / 2;

//    List<PhysicalObjectInRoom> thingsInRoom;

    public static void main(String[] args) {
        Room room = new Room();


        PlayerPosition playerPosition = room.getPlayerPosition();
        ObjectPosition objectPosition = room.getObjectPosition();


        System.out.println(playerPosition);
        room.goLeft();
        System.out.println(playerPosition);

    }


    public PlayerPosition getPlayerPosition() {
        return new PlayerPosition(playerCoordinateX, playerCoordinateY);

    }

    public ObjectPosition getObjectPosition() {
        return new ObjectPosition(monsterCoordinateX, monsterCoordinateY);

    }


    public int goLeft() {
        if (playerCoordinateX > 0) {
            return playerCoordinateX -= 1;
        }
        return playerCoordinateX;
    }

    public int goRight() {
        if (playerCoordinateX < 4) {
            return playerCoordinateX += 1;
        }
        return playerCoordinateX;
    }

    public int goDown() {
        if (playerCoordinateY < 4) {
            playerCoordinateY += 1;
        }
        return playerCoordinateY;
    }

    public int goUp() {
        if (playerCoordinateY > 0) {
            playerCoordinateY -= 1;
        }
        return playerCoordinateY;
    }

    public String[][] getMap() {
        String[][] map = new String[5][5];


        for (int i = 0; i < map.length; i++) {
            String[] mapRow = map[i];
            for (int j = 0; j < mapRow.length; j++) {
                if (playerCoordinateX == j && playerCoordinateY == i) {
                    mapRow[j] = "@";
                } else if
                        (monsterCoordinateX == j && monsterCoordinateY == i) {
                    mapRow[j] = "M";
                } else if (playerCoordinateX == monsterCoordinateX && playerCoordinateY == monsterCoordinateY) {
                    map[i][j] = "F";
                } else {
                    mapRow[j] = "O";
                }
            }

        }

        return map;
    }
}






