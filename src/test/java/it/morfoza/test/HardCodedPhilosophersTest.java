//package it.morfoza.test;
//
//import it.morfoza.*;
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//
///**
// * Created by Wojt on 2016-08-12.
// */
//public class HardCodedPhilosophersTest {
//    @Test
//    public void should(){
//        List<Philosopher> philosophers = new ArrayList<>();
//        Aristotle aristo = new Aristotle();
//        Plato plato = new Plato();
//        Socrates socrates = new Socrates();
//        philosophers.add(aristo);
//        philosophers.add(plato);
//        philosophers.add(socrates);
//        HardCodedPhilosopherRepository hardCodedPhilosopherRepository = new HardCodedPhilosopherRepository();
//        System.out.println(philosophers);
//        assertThat(philosophers).isNotNull();
//        assertThat(philosophers).contains(aristo);
//        assertThat(philosophers).isSameAs(hardCodedPhilosopherRepository.getAllPhilosophers());
//    }
//}
