package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Максимов on 17.03.2017.
 */
public class SomebodyTest {

    @Test
    public void takeChairTest(){
        Somebody s1 = new Somebody(1);
        Somebody s2 = new Somebody(1);
        ChairOfCapitan c1 = new ChairOfCapitan();

        s1.takeChair(c1);
        assertEquals(c1.owner,s1);
        assertEquals(s1.chair,true);
        s2.takeChair(c1);
        assertEquals(c1.owner,s1);
        assertEquals(s2.chair,false);
    }

}