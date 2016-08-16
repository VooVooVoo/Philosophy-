package it.morfoza;

/**
 * Created by Wojt on 2016-08-16.
 */
public class PlayerPosition {
    int playerCoordinateX;
    int playerCoordinateY;

    public PlayerPosition(int x, int y) {
        this.playerCoordinateX = x;
        this.playerCoordinateY = y;

    }

    public String toString() {
        return "Your player position is" + playerCoordinateX + playerCoordinateY;
    }
}
