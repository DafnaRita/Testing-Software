package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Максимов on 17.03.2017.
 */
public class Arthur {
    Emotions emotion;
    boolean inRoom = false;
    Eyes eyes;

    Arthur(Eyes eyes, Emotions emotion) {
        this.eyes = eyes;
        this.emotion = emotion;
    }

    public Eyes getEyes() {
        return eyes;
    }


    boolean comeIn(){
        return true;
    }

    void toSeeSomebody(){
        emotion = Emotions.STUNNED;
    }

    boolean jawIsLost() {
       return true;
    }
}