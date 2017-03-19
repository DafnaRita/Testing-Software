package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class LegsTest {
    Legs legs;

    @Before
    public void Init(){
        legs = new Legs();
    }

    @Test
    public void putOnControlPanelTrueTest(){
        legs.putOnControlPanel(true);
        assertTrue(legs.isOnControlPanel());
    }

    @Test
    public void putOnControlPanelFalseTest(){
        legs.putOnControlPanel(false);
        assertFalse(legs.isOnControlPanel());
    }
}
