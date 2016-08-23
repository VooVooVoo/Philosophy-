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


        PhilosophyController philosophyController = new PhilosophyController(philosopherRepository);

        assertTrue(philosophyController.userNickIsLongerThan12("tertertertetetertetet"));
        assertFalse(philosophyController.userNickIsLongerThan12("tert"));

    }


}