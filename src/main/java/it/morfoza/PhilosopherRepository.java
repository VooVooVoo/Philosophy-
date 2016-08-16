package it.morfoza;

import java.util.List;

public interface PhilosopherRepository {
    Philosopher getByName(String philosopherName);

    List<Philosopher> getAllPhilosophers();
}
