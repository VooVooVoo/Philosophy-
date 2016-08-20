package it.morfoza;

/**
 * Created by Wojt on 2016-08-08.
 */
public interface Philosopher {
    void attack1(Philosopher rival);

    void attack2(Philosopher rival);

    void attack3(Philosopher rival);

    void attack4(Philosopher rival);

    void attack5(Philosopher rival);

    void takeAttackBrain(long brainPower);

    void takeAttackRheto(long rhetorics);

    void takeAttackConceit(long conceit);

    void takeAttackMuscle(long musclePower);


    boolean isAlive();

    boolean isDumbfounded();

    boolean isWell();

void levelOne();
    void levelTwo();
    void levelThree();
    void levelFour();
    void levelFive();
    void levelSix();
    void levelSeven();
    void levelEight();
    void levelNine();
    void levelTen();



}

