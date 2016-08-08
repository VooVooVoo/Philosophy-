package it.morfoza;

/**
 * Created by Wojt on 2016-08-08.
 */
public abstract class PhilosopherBase {
    protected String name;
    protected long health;
    protected long brainPower;
    protected long rhetorics;
    protected long conceit;
    protected long wellBeing;
    protected long musclePower;
    protected boolean dumbfounded;

    public String toString() {return "Philosopher: " + name + " has " + health + " HP, his rhetorics level is " + rhetorics + " he is " + conceit + "% conceited, " + wellBeing + "% happy and his muscles look " + musclePower + "/100."; }

}
