package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HeadTest {
    Head head;

    @Before
    public void Init(){
        head = new Head(Side.LEFT);
    }

    @Test
    public void busynessTrueTest(){
        head.teeth.isPicked=true;
        assertEquals(true, head.busyness());
    }

    @Test
    public void busynessFalseTest(){
        head.teeth.isPicked=false;
        assertEquals(false, head.busyness());
    }
}
