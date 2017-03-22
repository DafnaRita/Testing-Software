package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Margo on 18.03.2017.
 */
public class Head {
    Teeth teeth;
    Side side;
    boolean rastasmile;

    Head(Side side) {
        teeth = new Teeth();
        this.side = side;
    }

    boolean busyness(){
        return teeth.isPicked;
    }
}

