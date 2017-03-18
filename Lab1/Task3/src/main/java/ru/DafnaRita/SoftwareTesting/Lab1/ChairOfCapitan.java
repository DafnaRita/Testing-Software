package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Максимов on 17.03.2017.
 */
public class ChairOfCapitan {
    Somebody owner = null;

    Somebody giveChair(Somebody owner){
        if (this.owner==null)
            this.owner=owner;
        return this.owner;
    }
}