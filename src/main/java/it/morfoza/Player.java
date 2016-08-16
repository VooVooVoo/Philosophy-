package it.morfoza;

/**
 * Created by Wojt on 2016-08-16.
 */
public class Player implements Philosopher {

    int playerCoordinateX;
    int playerCoordinateY;


    @Override
    public void attack1(Philosopher rival) {

    }

    @Override
    public void attack2(Philosopher rival) {

    }

    @Override
    public void attack3(Philosopher rival) {

    }

    @Override
    public void attack4(Philosopher rival) {

    }

    @Override
    public void attack5(Philosopher rival) {

    }

    @Override
    public void takeAttackBrain(long brainPower) {

    }

    @Override
    public void takeAttackRheto(long rhetorics) {

    }

    @Override
    public void takeAttackConceit(long conceit) {

    }

    @Override
    public void takeAttackMuscle(long musclePower) {

    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public boolean isDumbfounded() {
        return false;
    }

    @Override
    public boolean isWell() {
        return false;
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
