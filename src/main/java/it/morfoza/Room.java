package it.morfoza;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.List;

/**
 * Created by Wojt on 2016-08-15.
 */
public class Room {

    int playerCoordinateX;
    int playerCoordinateY;
    int objectCoordinateX;
    int objectCoordinateY;

//    List<PhysicalObjectInRoom> thingsInRoom;

    public static void main(String[] args) {
        Room room = new Room();


        PlayerPosition playerPosition = room.getPlayerPosition();


        System.out.println(playerPosition);
        room.goLeft();
        System.out.println(playerPosition);

    }


    public PlayerPosition getPlayerPosition(){
        return new PlayerPosition(playerCoordinateX, playerCoordinateY);

    }
    public ObjectPosition getObjectPosition(){
        return new ObjectPosition(objectCoordinateX, objectCoordinateY);

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

        for(int i=0;i<map.length;i++){


            String[] mapRow = map[i];
            for(int j=0;j<mapRow.length;j++){
                if(playerCoordinateX == j && playerCoordinateY == i) {
                    mapRow[j] = "@";
                } else {
                    mapRow[j]="O";
                }
            }

        }

        return map;
    }
}






