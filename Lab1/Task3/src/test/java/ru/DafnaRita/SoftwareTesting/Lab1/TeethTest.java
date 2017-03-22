package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeethTest {

    @Test
    public void pickHandTest(){
        Hand hand= new Hand(Side.LEFT);
        Teeth teeth = new Teeth();
        teeth.pickBy(hand);
        assertEquals(hand,teeth.pickedBy);
    }

    public void pickBoolTest(){
        Teeth teeth = new Teeth();
        teeth.pickBy(null);
        assertEquals(true, teeth.isPicked);
    }

}
