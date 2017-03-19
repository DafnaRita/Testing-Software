package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Максимов on 17.03.2017.
 */
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
    public void comeInTest(){
        assertTrue(arthur.comeIn());
    }

    @Test
    public void toSeeSomebodyTest(){
        arthur.toSeeSomebody();
        assertEquals(arthur.emotion, Emotions.STUNNED);
    }

    @Test
    public void jawIsLostTest(){
        assertTrue(arthur.jawIsLost());
    }

    @Test
    public void getEyesTest() {
        assertEquals(arthur.getEyes(), eyes);
    }

}