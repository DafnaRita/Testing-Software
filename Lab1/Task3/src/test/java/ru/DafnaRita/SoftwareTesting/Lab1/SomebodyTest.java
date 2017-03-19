package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SomebodyTest {
    Somebody somebody;
    List<Hand> hands;

    Hand leftHand;
    Hand rightHand;

    Legs legs;

    Head rightHead;

    Teeth teeth;

    static Head createHead(Side side) {
        return new Head(new Teeth(), side);
    }

    @Before
    public void Init(){
        hands = new ArrayList<Hand>();

        leftHand = new Hand(Side.LEFT);
        rightHand = new Hand(Side.RIGHT);
        hands.add(leftHand);

        rightHead = createHead(Side.RIGHT);

        legs = new Legs();

        teeth = new Teeth();
        somebody = new Somebody(
                hands,
                legs,
                rightHead
        );
    }

    /*если будет время покалдуй,
    чтобы и мессадж в исключении тоже проверялся*/
    @Test(expected = Exception.class)
    public void getExceptionHandTest() throws Exception  {
        somebody.getHand(Side.RIGHT);
    }

    @Test
    public void getHandTest () {
        try {
            assertEquals(somebody.getHand(Side.LEFT), leftHand);
        } catch (Exception e) {
        }
    }

    @Test
    public void getLegsTest () {
        assertEquals(somebody.getLegs(), legs);
    }

    @Test
    public void getHeadTest () {
        try {
            assertEquals(somebody.getHead(Side.RIGHT), rightHead);
        } catch (Exception e) {

        }
    }

    @Test(expected = Exception.class)
    public void getExeptionHeadTest () throws Exception{
        assertEquals(somebody.getHead(Side.LEFT), rightHead);
    }

    @Test
    public void pickInTest() {
        assertTrue(somebody.pickIn(teeth));
    }

    @Test
    public void layInChair() {
        assertFalse(somebody.inChair);
        somebody.layInChair(true);
        assertTrue(somebody.inChair);
    }
}