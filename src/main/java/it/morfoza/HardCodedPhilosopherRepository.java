package it.morfoza;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wojt on 2016-08-12.
 */
@Component
public class HardCodedPhilosopherRepository implements PhilosopherRepository {
    private List<Philosopher> philosophers = new ArrayList<>();

    public HardCodedPhilosopherRepository() {
        philosophers.add(new Aristotle());
        philosophers.add(new Plato());
        philosophers.add(new Socrates());
    }

    @Override
    public Philosopher getByName(String philosopherName) {

        return null;
    }

    @Override
    public List<Philosopher> getAllPhilosophers() {
        return philosophers;
    }


}

