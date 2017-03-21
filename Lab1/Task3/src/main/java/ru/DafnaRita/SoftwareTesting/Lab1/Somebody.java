package ru.DafnaRita.SoftwareTesting.Lab1;

public class Somebody  {
    Head leftHead;
    Head rightHead;

    Hand leftHands;
    Hand rightHands;

    Legs legs;

    Boolean isSeen;

    Somebody(Hand leftHands,Hand rightHands, Legs legs, Head leftHead, Head rightHead){
        this.leftHands = leftHands;
        this.rightHands = rightHands;

        this.legs = legs;

        this.leftHead = leftHead;
        this.rightHead = rightHead;
    }

    Head getHead(Side side) {
        if (side == Side.LEFT) {
            return this.leftHead;
        }

        return this.rightHead;
    }

    Hand getHand(Side side) {
        if (side == Side.LEFT) {
            return this.leftHands;
        }

        return this.rightHands;
    }

    void pickInTeeth(Side handSide, Side headSide) {
        try{
            if(this.getHand(handSide) == leftHands){
                this.getHead(headSide).pick(this.leftHands);
            } else if (this.getHand(handSide) == rightHands){
                this.getHead(headSide).pick(this.rightHands);
            } else {
                throw new Exception("Unknown hand");
            }
        } catch (Exception e){
            System.out.println("pickInTeeth error: " + e.getMessage());
        }
    }

    void louge(Chair chair) {
        chair.lounged = true;
        chair.loungeBy = this;
    }
}
