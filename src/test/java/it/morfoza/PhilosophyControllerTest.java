package it.morfoza;

import org.junit.Test;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Wojt on 2016-08-22.
 */
public class PhilosophyControllerTest {
    @Test
            public void shouldReturnPhilosopherByName() {
        PhilosopherRepository philosopherRepository = mock(PhilosopherRepository.class);
        Model model = mock(Model.class);

        Philosopher philosopher1 = new Aristotle();
        Philosopher philosopher2 = new Plato();

//        PhilosophyController philosophyController = new PhilosophyController(philosopherRepository);
//when(philosopherRepository.getByName("Plato")).thenReturn(philosopher1);
//        when(philosopherRepository.getByName("Aristotle")).thenReturn(philosopher2);
//philosophyController.fight("Aristotle", "philosophise", "Plato", model);
        //co tu można sprawdzić (jedna ze stron, np islongerthantwelve)????
        philosopherRepository.getByName("Plato");

    }


}