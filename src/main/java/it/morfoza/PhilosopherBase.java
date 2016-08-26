package it.morfoza;

/**
 * Created by Wojt on 2016-08-08.
 */
public abstract class PhilosopherBase {
    protected String name;
    protected int health;
    protected int brainPower;
    protected int rhetorics;
    protected int conceit;
    protected int wellBeing;
    protected int musclePower;
    protected boolean dumbfounded;
    protected int level;

    public String getName() {
        return name;
    }

    public String toString() {return "Philosopher: " + name + " has " + health + " HP, his rhetorics level is " + rhetorics + " he is " + conceit + "% conceited, " + wellBeing + "% happy and his muscles look " + musclePower + "/100."; }

}
