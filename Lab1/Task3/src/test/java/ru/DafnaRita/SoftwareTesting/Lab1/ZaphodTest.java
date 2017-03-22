package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZaphodTest {
    Zaphod zaphod;
    Console console;
    Chair chair;

    @Before
    public void init(){
        zaphod = new Zaphod();
        chair = new Chair();
        console = new Console();
    }

    @Test
    public void lougeByTest(){
        zaphod.louge(chair);
        assertEquals(chair.loungeBy,zaphod);
    }

    @Test
    public void lougeTrueTest(){
        zaphod.louge(chair);
        assertEquals(true,chair.lounged);
    }

    @Test
    public void smileLeftTest(){
        zaphod.smile(Side.LEFT);
        assertEquals(zaphod.leftHead.rastasmile,true);
    }

    @Test
    public void smileRightTest(){
        zaphod.smile(Side.RIGHT);
        assertEquals(zaphod.rightHead.rastasmile,true);
    }

    @Test
    public void pickInTeethLL(){
        zaphod.pickInTeeth(Side.LEFT,Side.LEFT);
        assertEquals(true, zaphod.leftHead.teeth.isPicked);
        assertEquals(zaphod.leftHand, zaphod.leftHead.teeth.pickedBy);
    }

    @Test
    public void pickInTeethLR(){
        zaphod.pickInTeeth(Side.LEFT,Side.RIGHT);
        assertEquals(true, zaphod.rightHead.teeth.isPicked);
        assertEquals(zaphod.leftHand, zaphod.rightHead.teeth.pickedBy);
    }

    @Test
    public void pickInTeethRL(){
        zaphod.pickInTeeth(Side.RIGHT,Side.LEFT);
        assertEquals(true, zaphod.leftHead.teeth.isPicked);
        assertEquals(zaphod.rightHand, zaphod.leftHead.teeth.pickedBy);
    }
    @Test
    public void pickInTeethRR(){
        zaphod.pickInTeeth(Side.RIGHT,Side.RIGHT);
        assertEquals(true, zaphod.rightHead.teeth.isPicked);
        assertEquals(zaphod.rightHand, zaphod.rightHead.teeth.pickedBy);
    }

}