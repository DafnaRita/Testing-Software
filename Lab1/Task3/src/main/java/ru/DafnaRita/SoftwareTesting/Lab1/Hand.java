package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Margo on 18.03.2017.
 */
public class Hand {
    Side side;

    Hand(Side side) {
        this.side = side;
    }

    public void pickInTeeth(Teeth teeth){
        teeth.pickBy(this);
    }
}

