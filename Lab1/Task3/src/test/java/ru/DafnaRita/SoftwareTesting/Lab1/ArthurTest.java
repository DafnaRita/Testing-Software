package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Максимов on 17.03.2017.
 */
public class ArthurTest {

    @Test
    public void comeInTest(){
        Arthur a = new Arthur();
        a.emotion=Emotions.NERVOUNESS;
        a.inRoom=false;
        a.comeIn();
        assertEquals(a.inRoom,true);
    }

    @Test
    public void toSeeSomebodyTest(){
        Somebody s = new Somebody(0);
        Arthur a = new Arthur();
        System.out.println("toSeeSomebodyTest()");
        a.toSeeSomebody(s);
        assertEquals(a.emotion,Emotions.SHOCKNESS);
        System.out.println(++s.heads);
        a.toSeeSomebody(s);
        assertEquals(a.emotion,Emotions.NERVOUNESS);
        System.out.println(++s.heads);
        a.toSeeSomebody(s);
        assertEquals(a.emotion,Emotions.ASTONISHMENT);
        System.out.println(++s.heads);
        a.toSeeSomebody(s);
        assertEquals(a.emotion,Emotions.SHOCKNESS);

    }

    @Test
    public void jawIsLost(){
        Arthur a = new Arthur();
        assertEquals(a.jawIsLost(),false);
        a.emotion=Emotions.ASTONISHMENT;
        assertEquals(a.jawIsLost(),true);
        a.emotion=Emotions.SHOCKNESS;
        assertEquals(a.jawIsLost(), false);

    }

}