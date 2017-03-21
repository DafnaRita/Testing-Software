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
        Stuff stuff;
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
        arthur.see(stuff);
        assertEquals(stuff, 1); //1 раз посмотрели
        assertNotEquals(arthur.emotion, Emotions.UNBELIEVING); //2 раза посмотрели
    }
    @Test
    public void seeStuff2TimeAndNotBelieveTest(){
        arthur.see(stuff);
        arthur.see(stuff);
        assertEquals(stuff, 2); //2 раза посмотрели
        assertNotEquals(arthur.emotion, Emotions.UNBELIEVING); //2 раза посмотрели
    }
    @Test
    public void seeStuffAndNotBelieveTest(){
        arthur.see(stuff);
        arthur.see(stuff);
        arthur.see(stuff);
        assertEquals(stuff, 3); //2 раза посмотрели
        assertEquals(arthur.emotion, Emotions.UNBELIEVING); //2 раза посмотрели
    }
}