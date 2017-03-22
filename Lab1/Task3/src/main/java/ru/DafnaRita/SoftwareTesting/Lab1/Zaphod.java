package ru.DafnaRita.SoftwareTesting.Lab1;

public class Zaphod {
    Head leftHead;
    Head rightHead;

    Hand leftHand;
    Hand rightHand;
    Legs legs;

    boolean isSeen;
    final boolean manyHeads;

    Zaphod(){
        leftHand = new Hand(Side.LEFT);
        rightHand = new Hand(Side.RIGHT);
        legs = new Legs();
        leftHead = new Head(Side.LEFT);
        rightHead = new Head(Side.RIGHT);
        manyHeads=true;
    }

    void pickInTeeth(Side handSide, Side headSide) {
        if (headSide==Side.LEFT)
            leftHead.teeth.pickBy(handSide==Side.LEFT ? leftHand : rightHand);
        else
            rightHead.teeth.pickBy(handSide==Side.LEFT ? leftHand : rightHand);
    }

    void louge(Chair chair) {
        chair.lounged = true;
        chair.loungeBy = this;
    }

    void smile(Side side){
        if(side==Side.LEFT)
            leftHead.rastasmile=true;
        else
            rightHead.rastasmile=true;
    }
}
