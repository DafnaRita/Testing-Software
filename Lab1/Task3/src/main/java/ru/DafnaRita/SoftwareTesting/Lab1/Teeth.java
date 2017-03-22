package ru.DafnaRita.SoftwareTesting.Lab1;

public class Teeth {
    boolean isPicked=false;
    Hand pickedBy;

    public void pickBy(Hand hand){
        this.pickedBy = hand;
        this.isPicked = true;
    }
}

