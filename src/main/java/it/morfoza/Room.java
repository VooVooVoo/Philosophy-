package it.morfoza;

/**
 * Created by Wojt on 2016-08-15.
 */
public class Room {

    Player[][] myRoom = new Player[5][5];
    Player player = new Player();
    Room room1 = new Room();
    int playerCoordinateX;
    int playerCoordinateY;
    public static void main(String[] args) {


        PlayerPosition playerPosition = new PlayerPosition(2, 4);
Player player= new Player();
        playerPosition


    }


    public PlayerPosition getPlayerPosition() {

        Player[][] myRoom2 = new Player[5][5];
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

    public void goLeft() {
        if (playerCoordinateX > 0) {
            playerCoordinateX -= 1;
        }
    }

    public void goRight() {
        if (playerCoordinateX < 4) {
            playerCoordinateX += 1;
        }
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





