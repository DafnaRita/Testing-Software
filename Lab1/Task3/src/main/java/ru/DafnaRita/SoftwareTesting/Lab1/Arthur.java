package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Максимов on 17.03.2017.
 */
public class Arthur {
    Emotions emotion = Emotions.NERVOUNESS;
    boolean inRoom = false;

    void comeIn(){
        if (emotion==Emotions.NERVOUNESS && !inRoom)
            inRoom=true;
    }

    void toSeeSomebody(Somebody s){
        switch (s.heads){
            case 1: emotion=Emotions.NERVOUNESS; break;
            case 2: emotion=Emotions.ASTONISHMENT; break;
            default: emotion=Emotions.SHOCKNESS;
        }
    }

    boolean jawIsLost() {
        if (emotion == Emotions.ASTONISHMENT) return true;
        return false;
    }
}