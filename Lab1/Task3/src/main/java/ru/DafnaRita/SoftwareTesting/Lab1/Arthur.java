package ru.DafnaRita.SoftwareTesting.Lab1;

public class Arthur {
    Emotions emotion;
    boolean inRoom;
    Eyes eyes;
    Jaw jaw;


    Arthur(Eyes eyes) {
        this.eyes = eyes;
        this.emotion = Emotions.NONE;
    }

    public void changeEmotion(Emotions emotion) {
        this.emotion = emotion;
    }

    void comeIn(Room room){
        this.changeEmotion(Emotions.NERVOUNESS);
        room.isVisited = true;
    }

    void see(Somebody somebody){
        somebody.isSeen = true;
        this.changeEmotion(Emotions.STUNNED); //ошеломлен
    }

    void see(Stuff stuff){
        stuff.raise();
        if(stuff.count > 2){
            this.changeEmotion(Emotions.UNBELIEVING);
        }
    }
}