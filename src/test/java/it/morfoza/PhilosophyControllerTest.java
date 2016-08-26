package it.morfoza;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Wojt on 2016-08-22.
 */
public class PhilosophyControllerTest {
//    @Test
//    public void shouldReturnPhilosopherByName() {
//        //Given
//        PhilosopherRepository philosopherRepository = mock(PhilosopherRepository.class);
//        PhilosophyController sut = new PhilosophyController(philosopherRepository);
////When-Then
//        assertTrue(sut.userNickIsLongerThan12("tertertertetetertetet"));
//        assertFalse(sut.userNickIsLongerThan12("tert"));
//
//    }

//    @Test
//    public void throwsExceptionWhenAttacksSelf() throws Exception{
//        //Given
//        Model model = mock(Model.class);
//        String philosopher1 = "Aristo";
//        String philosopher2 = "Aristo";
//        String attack = "philosophise";
//        PhilosopherRepository philosopherRepository = mock(PhilosopherRepository.class);
//        PhilosophyController sut = new PhilosophyController(philosopherRepository);
//        RuntimeException runtimeException = new RuntimeException();
//        //When
//
//        try {
//            sut.fight(philosopher1, attack, philosopher2, model);
//            fail("brak wyjatku");
//
//
//        } catch (RuntimeException e) {
//
//            assertTrue(runtimeException.getMessage().equals("Cannot attack self!!!"));
//        }
//    }
@Test


   public void goesRight(){
    Room room = new Room();


    room.goRight();
//tutaj sobie sprawdzam prawdziwość twierdzenia, że playerCoordinateX podany jako parametr metody getPlayerPosition w klasie room
    //bedzie rowny 1 (startujemy w roomie od zera) a playerCoordinateY pozostanie bez zmian

    assertTrue(room.getPlayerPosition().playerCoordinateX == 1);
    assertTrue(room.getPlayerPosition().playerCoordinateY == 0);
    assertFalse(room.getPlayerPosition().playerCoordinateX == 0);
    assertFalse(room.getPlayerPosition().playerCoordinateY == 1);
}

}