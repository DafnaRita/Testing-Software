package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Margo on 18.03.2017.
 */
public class Head {
    Teeth teeth;
    Side side;

    Head(Teeth teeth, Side side) {
        this.teeth = teeth;
        this.side = side;
    }

    public void pick(Hand hand) {
        this.teeth.isPicked = true;
        this.teeth.pickedBy = hand;
    }
}

