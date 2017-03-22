package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArthurTest {
    Room room;
    Arthur arthur;
    Zaphod zaphod;
    Stuff stuff;

    @Before
    public void Init(){
        room = new Room();
        arthur = new Arthur();
        zaphod = new Zaphod();
        stuff = new Stuff(0);
    }

    /*Артур, нервничая, вошел следом*/
    @Test
    public void comeInTest(){
        arthur.comeIn(room);
        assertEquals(arthur.emotion, Emotions.NERVOUNESS);
        assertTrue(room.isVisited);
    }

    /*был ошеломлен, увидев развалившегося в кресле человека*/
    @Test
    public void seeZaphodTest(){
        arthur.see(zaphod);
        assertEquals(arthur.emotion, Emotions.STUNNED); //был ошеломлен
        assertTrue(zaphod.isSeen); // zaphod увиден
    }

    /*Количество вещей, видя которые, Артур не верил своим глазам, все росло*/
    @Test
    public void seeStuff2TimeAndBelieveTest(){
        arthur.see(stuff);
        assertEquals(stuff.count, 1); //2 разa посмотрели
        assertNotEquals(arthur.emotion, Emotions.UNBELIEVING); //2 раза посмотрели
        assertTrue(arthur.eyes.belief);
    }
    @Test
    public void seeStuff2TimeAndNotBelieveTest(){
        arthur.see(stuff);
        arthur.see(stuff);
        assertEquals(stuff.count, 2); //2 раза посмотрели
        assertNotEquals(arthur.emotion, Emotions.UNBELIEVING); //2 раза посмотрели
        assertTrue(arthur.eyes.belief);
    }
    @Test
    public void seeStuffAndNotBelieveTest(){
        arthur.see(stuff);
        arthur.see(stuff);
        arthur.see(stuff);
        assertEquals(stuff.count, 3); //2 раза посмотрели
        assertEquals(arthur.emotion, Emotions.UNBELIEVING); //2 раза посмотрели
        assertFalse(arthur.eyes.belief);
    }

    @Test
    public void jawLossTrueTest(){
        arthur.emotion=Emotions.UNBELIEVING;
        arthur.jawLoss();
        assertTrue(arthur.jaw.isDown);
    }

    @Test
    public void jawLossFalseTest(){
        assertNotEquals(arthur.emotion,Emotions.UNBELIEVING);
        arthur.jawLoss();
        assertFalse(arthur.jaw.isDown);
    }
}