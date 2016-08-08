package it.morfoza;

/**
 * Created by Wojt on 2016-08-08.
 */
public interface Philosopher {
void attack1(Philosopher rival);
void attack2(Philosopher rival);
void attack3(Philosopher rival);
void attack4(Philosopher rival);

    void takeAttackBrain(long brainPower);
    void takeAttackRheto(long rhetorics);
    void takeAttackConceit(long conceit);
    void takeAttackMuscle(long musclePower);

    public boolean isAlive();
    public boolean isDumbfounded();
    public boolean isWell();


}

