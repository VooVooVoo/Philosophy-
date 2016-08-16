package it.morfoza.test;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Wojt on 2016-08-12.
 */

public class Assertion2Test {
    @Test
    public void should(){
        boolean a = true;

        Assert.assertTrue(a);

        long b = 7;
        long c = 7;
        Assert.assertEquals(b, c);

        Object dog = new Object();

        Object cat = new Object();

        Assert.assertNotEquals(dog, cat);

        Assert.assertFalse(7<3);

        Assert.assertNotEquals(b+1, c);

        String d = "aaaaaa";

        assertThat(d).isNotNull();

    }

}
