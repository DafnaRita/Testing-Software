package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Максимов on 17.03.2017.
 */
public class Somebody {
    int heads;
    boolean chair;
    Somebody(int h){
        heads=h;
    }

    void takeChair(ChairOfCapitan c){
        if (this==c.giveChair(this)) chair=true;
        else chair=false;
    }
}