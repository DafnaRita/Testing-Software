package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Margo on 18.03.2017.
 */
public class Head {
    Teeth teeth;
    Side side;
    Boolean isBusy;
    Boolean isSmile;
    Emotions smileType;

    Head(Teeth teeth, Side side) {
        this.teeth = teeth;
        this.side = side;
        this.isBusy = false;
        this.isSmile = false;
        this.smileType = Emotions.NONE;
        this.isSmile = false;
    }

    void smile(){
        this.smileType = Emotions.WIDEANDUNCONSTRAINED;
        this.isSmile = true;
    }

    public void pick(Hand hand) {
        this.teeth.isPicked = true;
        this.teeth.pickedBy = hand;
        this.isBusy = true;
    }
}

