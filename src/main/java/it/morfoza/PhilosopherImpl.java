package it.morfoza;

/**
 * Created by Wojt on 2016-08-25.
 */
public class PhilosopherImpl extends PhilosopherBase implements Philosopher {

    public PhilosopherImpl(String name, int health, int brainPower, int conceit, int rhetorics, int wellBeing, int musclePower, boolean dumbfounded, int level) {

        this.name = name;
        this.health = health;
        this.brainPower = brainPower;
        this.conceit = conceit;
        this.rhetorics = rhetorics;
        this.wellBeing = wellBeing;
        this.musclePower = musclePower;
        this.dumbfounded = dumbfounded;
        this.level = level;

    }

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

    @Override
    public void levelOne() {

    }

    @Override
    public void levelTwo() {

    }

    @Override
    public void levelThree() {

    }

    @Override
    public void levelFour() {

    }

    @Override
    public void levelFive() {

    }

    @Override
    public void levelSix() {

    }

    @Override
    public void levelSeven() {

    }

    @Override
    public void levelEight() {

    }

    @Override
    public void levelNine() {

    }

    @Override
    public void levelTen() {

    }
}
