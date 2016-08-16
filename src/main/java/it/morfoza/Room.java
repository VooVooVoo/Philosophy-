package it.morfoza;

/**
 * Created by Wojt on 2016-08-15.
 */
public class Room {

    Player[][] myRoom2 = new Player[5][5];
    Player player = new Player();
    int playerCoordinateX;
    int playerCoordinateY;

    public static void main(String[] args) {
        Player[][] myRoom2 = new Player[5][5];
        Player player = new Player();
        Room room = new Room();
        PlayerPosition playerPosition = room.getPlayerPosition();


        room.getPlayerPosition();
        System.out.println(playerPosition);
        room.goLeft();
        System.out.println(playerPosition);

    }


    public PlayerPosition getPlayerPosition() {


       PlayerPosition playerPosition = new PlayerPosition(playerCoordinateX, playerCoordinateY);
        int x = -1;
        int y = -1;
        for (int i = 0; i < myRoom2[i].length; i++) {
            for (int j = 0; j < myRoom2[j].length; j++) {
                if (myRoom2[i][j] != null) {
                    x = i;
                    y = j;
                }
            }
        }
        return new PlayerPosition(x, y);

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

    public void goDown() {
        if (playerCoordinateY < 4) {
            playerCoordinateY += 1;
        }
    }

    public void goUp() {
        if (playerCoordinateY > 0) {
            playerCoordinateY -= 1;
        }
    }
}






