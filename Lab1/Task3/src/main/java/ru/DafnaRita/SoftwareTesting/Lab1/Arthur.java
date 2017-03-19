package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Максимов on 17.03.2017.
 */
public class Arthur {
    Emotions emotion;
    boolean inRoom;
    boolean isJawIsLost;
    Eyes eyes;

    Arthur(Eyes eyes, Emotions emotion) {
        this.isJawIsLost = false;
        this.inRoom = false;
        this.eyes = eyes;
        this.emotion = emotion;
    }

    public void believeEyes(Boolean b) {
        emotion = Emotions.UNBELIEVABLY;
        this.eyes.believe(b);
    }

    public Eyes getEyes() {
        return this.eyes;
    }

    boolean comeIn(){
        inRoom = true;
        emotion = Emotions.STUNNED;
        this.jawIsLost();
        return true;
    }

    void toSeeSomebody(){
        emotion = Emotions.STUNNED;
    }

    void jawIsLost() {
        this.isJawIsLost = true;
    }
}