package it.morfoza;

/**
 * Created by Wojt on 2016-08-08.
 */
public class Plato extends PhilosopherBase {

    public Plato() {
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
}
