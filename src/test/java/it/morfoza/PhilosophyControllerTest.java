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
        //Given
        PhilosopherRepository philosopherRepository = mock(PhilosopherRepository.class);
        PhilosophyController sut = new PhilosophyController(philosopherRepository);
//When-Then
        assertTrue(sut.userNickIsLongerThan12("tertertertetetertetet"));
        assertFalse(sut.userNickIsLongerThan12("tert"));

    }


}