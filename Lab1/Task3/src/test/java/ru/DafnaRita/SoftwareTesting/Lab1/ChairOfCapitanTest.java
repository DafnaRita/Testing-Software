package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Максимов on 17.03.2017.
 */
public class ChairOfCapitanTest {

    @Test
    public void giveChairTest(){
        ChairOfCapitan c = new ChairOfCapitan();
        Somebody s = new Somebody(2);
        assertEquals(c.giveChair(s),s);
    }

}