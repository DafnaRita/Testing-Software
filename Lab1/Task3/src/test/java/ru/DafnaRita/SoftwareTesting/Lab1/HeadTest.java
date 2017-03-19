package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HeadTest {
    Head leftHead;
    Head rightHead;
    Teeth teethForLeftHead;
    Teeth teethForRightHead;

    @Before
    public void Init(){
        teethForLeftHead = new Teeth();
        teethForRightHead = new Teeth();
        leftHead = new Head(teethForLeftHead, Side.LEFT);
        rightHead = new Head(teethForRightHead, Side.RIGHT);
    }

    @Test
    public void getTeeth1Test(){
        assertEquals(leftHead.getTeeth(), teethForLeftHead);
    }

    @Test
    public void getTeeth2Test(){
        assertEquals(rightHead.getTeeth(), teethForRightHead);
    }



    @Test
    public void getSide1Test(){
        assertEquals(leftHead.getSide(), Side.LEFT);
    }

    @Test
    public void getSide2Test(){
        assertEquals(rightHead.getSide(), Side.RIGHT);
    }

    @Test
    public void smileTest(){
        assertTrue(leftHead.smile());
    }
}
