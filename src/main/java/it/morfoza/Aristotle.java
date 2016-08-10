package it.morfoza;

/**
 * Created by Wojt on 2016-08-08.
 */
public class Aristotle extends PhilosopherBase implements Philosopher{

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
        conceit -= rhetorics/10;
        wellBeing -= rhetorics/7;
        dumbfounded = true;
    }


    public void takeAttackConceit(long conceit) {
        this.conceit -= conceit/20;

    }



    public void takeAttackMuscle(long musclePower) {
        health -= musclePower;
        this.musclePower -= musclePower/10;


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

    public void attack1(Philosopher rival){
        rival.takeAttackBrain(brainPower);
    }
    public void attack2(Philosopher rival){
        rival.takeAttackRheto(rhetorics);
    }
    public void attack3(Philosopher rival){
        rival.takeAttackConceit(conceit);
    }
    public void attack4(Philosopher rival){
        rival.takeAttackMuscle(musclePower);
    }
    public void attack5(Philosopher rival){
        System.out.println(name + " attacks " + rival + " with his special power of Aristotelian Logic!!!");
        rival.takeAttackConceit(conceit);
        rival.takeAttackRheto(rhetorics);
        rival.takeAttackBrain(brainPower);
        rival.isDumbfounded();
    }


}