package it.morfoza;

public interface PhilosopherRepository {
    Philosopher getByName(String philosopherName);
}
