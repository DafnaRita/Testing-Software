package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArthurTest {
    Stuff stuff;
    Arthur arthur;
    Eyes eyes;

    @Before
    public void Init(){
        stuff = new Stuff(5);
        eyes = new Eyes();
        arthur = new Arthur(eyes, Emotions.STUNNED);
    }

    @Test
    public void comeInTest1() {
        assertTrue(arthur.comeIn());
    }

    @Test
    public void comeInTest2(){
        arthur.comeIn();
        assertTrue(arthur.inRoom);
    }

    @Test
    public void comeInTest3(){
        arthur.comeIn();
        assertEquals(arthur.emotion, Emotions.STUNNED);
    }

    @Test
    public void comeInTest4(){
        arthur.comeIn();
        assertTrue(arthur.isJawIsLost);
    }

    @Test
    public void toSeeSomebodyTest(){
        arthur.toSeeSomebody();
        assertEquals(arthur.emotion, Emotions.STUNNED);
    }

    @Test
    public void jawIsLostTest(){
        arthur.jawIsLost();
        assertTrue(arthur.isJawIsLost);
    }

    @Test
    public void getEyesTest() {
        assertEquals(arthur.getEyes(), eyes);
    }

    @Test
    public void believeEyesTrueTest() {
        arthur.believeEyes(true);
        assertTrue(eyes.belief);
    }

    @Test
    public void believeEyesFalseTest() {
        arthur.believeEyes(false);
        assertFalse(eyes.belief);
    }
}