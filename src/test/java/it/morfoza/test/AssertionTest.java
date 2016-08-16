package it.morfoza.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Wojt on 2016-08-12.
 */
public class AssertionTest {
    @Test
    public void should(){
        //Given
        Grupa grupa = new Grupa();
        grupa.dodajDobregoUcznia();
        grupa.dodajZlegoUcznia();
        //When
        int[] faktyczneOceny = grupa.ocenUczniow();

        //Then
        int[] oczekiwaneOceny = {5, 2};

        Assert.assertArrayEquals(faktyczneOceny, oczekiwaneOceny);
        grupa.ocenUczniow();
//        Assert.assertTrue(true);
//        Assert.assertFalse(false);
//        int[] tablica1 = new int[5];
//        int [] tablica2 = new int[5];
//        Assert.assertArrayEquals(tablica1, tablica2);


    }

}
