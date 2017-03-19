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

    public Teeth getTeeth() {
        return teeth;
    }

    public Side getSide() {
        return side;
    }

    public Boolean smile() {
        return true;
    }
}
