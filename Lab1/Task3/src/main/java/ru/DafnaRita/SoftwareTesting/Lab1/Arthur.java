package ru.DafnaRita.SoftwareTesting.Lab1;

public class Arthur {
    Emotions emotion;
    boolean inRoom;
    Eyes eyes;
    Jaw jaw;

    Arthur() {
        eyes = new Eyes();
        jaw = new Jaw();
        emotion = Emotions.NONE;
    }

    void comeIn(Room room){
        emotion=Emotions.NERVOUNESS;
        room.isVisited = true;
    }

    void see(Zaphod zaphod){
        zaphod.isSeen = true;
        if (zaphod.manyHeads)
            emotion=Emotions.STUNNED;
    }

    void see(Stuff stuff){
        stuff.raise();
        if(stuff.count > 2){
            emotion=Emotions.UNBELIEVING;
            eyes.belief=false;
        }
    }

    void jawLoss(){
        if (emotion==Emotions.UNBELIEVING)
            jaw.isDown=true;
    }
}