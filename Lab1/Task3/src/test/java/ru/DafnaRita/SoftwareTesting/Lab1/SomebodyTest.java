package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SomebodyTest {
    SomebodyFactory factory;
    Console console;
    Chair chair;

    @Before
    public void Init(){
        factory = new SomebodyFactory();
        console = new Console();
        chair = new Chair();
    }

    /*ковыряющего !левой рукой! в зубах правой головы*/
    @Test
    public void pickByLeftHandTest() {
        factory.somebody.getHand(Side.LEFT).pickInTeeth(factory.somebody.getHead(Side.RIGHT).teeth);
        assertEquals(factory.somebody.getHead(Side.RIGHT).teeth.pickedBy, factory.leftHand);
    }

    /*!ковыряющего! левой рукой в зубах !правой головы!*/
    @Test
    public void pickInTeethOfRightHeadTest() {
        factory.somebody.getHand(Side.LEFT).pickInTeeth(factory.somebody.getHead(Side.RIGHT).teeth);
        assertTrue(factory.somebody.getHead(Side.RIGHT).teeth.isPicked);
        assertFalse(factory.somebody.getHead(Side.LEFT).teeth.isPicked);
    }

    /*положившего ноги на пульт управления */
    @Test
    public void putOnConsoleTest() {
        factory.somebody.legs.putOnConsole(console);
        assertEquals(console.putBy, factory.somebody.legs);
        assertTrue(factory.somebody.legs.putOnConsole);
    }

    /*положившего ноги на пульт управления */
    @Test
    public void loungeInChairTest() {
        factory.somebody.louge(chair);
        assertEquals(chair.loungeBy, factory.somebody);
        assertTrue(chair.lounged);
    }
}