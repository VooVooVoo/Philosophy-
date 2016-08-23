package it.morfoza;

import java.util.List;

/**
 * Created by Wojt on 2016-08-19.
 */
public class User {
    String userNick;
    List<Philosopher> userPhilosopher;
    int userPhilosopherLevel;

    public String toString() {
        return userNick + userPhilosopher;
    }

}
