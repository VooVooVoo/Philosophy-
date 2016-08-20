package it.morfoza;

/**
 * Created by Wojt on 2016-08-08.
 */
public class Aristotle extends PhilosopherBase implements Philosopher {

    public Aristotle() {
        name = "Aristotle";
        health = 1000;
        brainPower = 100;
        rhetorics = 100;
        conceit = 100;
        wellBeing = 100;
        musclePower = 100;
        dumbfounded = false;
    }

    public void takeAttackBrain(long brainPower) {
        conceit -= brainPower / 10;
        wellBeing -= brainPower / 10;
    }

    public void takeAttackRheto(long rhetorics) {
        conceit -= rhetorics / 10;
        wellBeing -= rhetorics / 7;
        dumbfounded = true;
    }


    public void takeAttackConceit(long conceit) {
        this.conceit -= conceit / 20;

    }


    public void takeAttackMuscle(long musclePower) {
        health -= musclePower;
        this.musclePower -= musclePower / 10;


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
        health = 1100;
        brainPower = 110;
        rhetorics = 110;
        conceit = 110;
        wellBeing = 110;
        musclePower = 110;

    }

    @Override
    public void levelTwo() {
        health = 1200;
        brainPower = 120;
        rhetorics = 120;
        conceit = 120;
        wellBeing = 120;
        musclePower = 120;

    }

    @Override
    public void levelThree() {
        health = 1300;
        brainPower = 130;
        rhetorics = 130;
        conceit = 130;
        wellBeing = 130;
        musclePower = 130;

    }

    @Override
    public void levelFour() {
        health = 1400;
        brainPower = 140;
        rhetorics = 140;
        conceit = 140;
        wellBeing = 140;
        musclePower = 140;

    }

    @Override
    public void levelFive() {
        health = 1500;
        brainPower = 150;
        rhetorics = 150;
        conceit = 150;
        wellBeing = 150;
        musclePower = 150;

    }

    @Override
    public void levelSix() {
        health = 1600;
        brainPower = 160;
        rhetorics = 160;
        conceit = 160;
        wellBeing = 160;
        musclePower = 160;

    }

    @Override
    public void levelSeven() {
        health = 1700;
        brainPower = 170;
        rhetorics = 170;
        conceit = 170;
        wellBeing = 170;
        musclePower = 170;

    }

    @Override
    public void levelEight() {
        health = 1800;
        brainPower = 180;
        rhetorics = 180;
        conceit = 180;
        wellBeing = 180;
        musclePower = 180;

    }

    @Override
    public void levelNine() {
        health = 1900;
        brainPower = 190;
        rhetorics = 190;
        conceit = 190;
        wellBeing = 190;
        musclePower = 190;

    }

    @Override
    public void levelTen() {
        health = 2000;
        brainPower = 200;
        rhetorics = 200;
        conceit = 200;
        wellBeing = 200;
        musclePower = 200;

    }

    public void attack1(Philosopher rival) {
        rival.takeAttackBrain(brainPower);
    }

    public void attack2(Philosopher rival) {
        rival.takeAttackRheto(rhetorics);
    }

    public void attack3(Philosopher rival) {
        rival.takeAttackConceit(conceit);
    }

    public void attack4(Philosopher rival) {
        rival.takeAttackMuscle(musclePower);
    }

    public void attack5(Philosopher rival) {
        System.out.println(name + " attacks " + rival + " with his special power of Aristotelian Logic!!!");
        rival.takeAttackConceit(conceit);
        rival.takeAttackRheto(rhetorics);
        rival.takeAttackBrain(brainPower);
        rival.isDumbfounded();
    }


}