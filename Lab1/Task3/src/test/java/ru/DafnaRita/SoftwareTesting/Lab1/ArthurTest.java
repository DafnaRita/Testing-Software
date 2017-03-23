package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArthurTest {
    Room room;
    Arthur arthur;
    Eyes eyes;
    SomebodyFactory factory;
    Stuff stuff;

    @Before
    public void Init(){
        room = new Room();
        eyes = new Eyes();
        arthur = new Arthur(eyes);
        factory = new SomebodyFactory();
        stuff = new Stuff();
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
    public void toSeeSomebodyTest(){
        arthur.see(factory.somebody);
        assertEquals(arthur.emotion, Emotions.STUNNED); //был ошеломлен
        assertTrue(factory.somebody.isSeen); // somebody увиден
    }

    /*Количество вещей, видя которые, Артур не верил своим глазам, все росло*/
    @Test
    public void seeStuff1TimeAndBelieveTest(){
        assertNotEquals(arthur.emotion, Emotions.UNBELIEVING);
        arthur.see(stuff);
        assertEquals(stuff.count, 1); //1 раз посмотрели
        assertNotEquals(arthur.emotion, Emotions.UNBELIEVING);
    }

    /*Количество вещей, видя которые, Артур не верил своим глазам, все росло*/
    @Test
    public void seeStuff2TimeAndBelieveTest(){
        assertNotEquals(arthur.emotion, Emotions.UNBELIEVING);
        arthur.see(stuff);
        arthur.see(stuff);
        assertEquals(stuff.count, 2); //2 раза посмотрели
        assertEquals(arthur.emotion, Emotions.UNBELIEVING);
    }

    /*Количество вещей, видя которые, Артур не верил своим глазам, все росло*/
    @Test
    public void seeStuffAndNotBelieveTest(){
        assertNotEquals(arthur.emotion, Emotions.UNBELIEVING);
        arthur.see(stuff);
        arthur.see(stuff);
        arthur.see(stuff);
        assertEquals(stuff.count, 3); //3 раза посмотрели
        assertEquals(arthur.emotion, Emotions.UNBELIEVING); //2 раза посмотрели
    }

    /*Его челюсть отвисла(от того что он увидел слишком много странных вещей*/
    @Test
    public void asIsDownTest(){
        assertFalse(arthur.jawIsDown);
        arthur.see(stuff);
        arthur.see(stuff);
        arthur.see(stuff);
        assertTrue(arthur.jawIsDown);
    }
}