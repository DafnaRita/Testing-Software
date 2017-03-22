package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Максимов on 22.03.2017.
 */
public class StuffTest {
    Stuff stuff;

    @Test
    public void raiseTest(){
        Random r = new Random();
        int n = r.nextInt();
        stuff = new Stuff(n);
        stuff.raise();
        assertEquals(stuff.count,n+1);
    }

}