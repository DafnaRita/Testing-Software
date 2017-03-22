package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LegsTest {
    Legs legs;
    Console console;


    @Before
    public void Init(){
        legs = new Legs();
        console = new Console();
    }

    @Test
    public void putOnControlPanelTrueTest(){
        legs.putOnConsole(console);
        assertEquals(console.putBy, legs);
    }

    @Test
    public void putOnControlPanelFalseTest(){
        legs.putOnConsole(console);
        assertEquals(true,legs.putOnConsole);
    }
}
