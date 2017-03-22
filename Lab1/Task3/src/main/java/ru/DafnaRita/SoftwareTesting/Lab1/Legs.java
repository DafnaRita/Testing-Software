package ru.DafnaRita.SoftwareTesting.Lab1;

public class Legs {
    public boolean putOnConsole=false;

    void putOnConsole (Console console){
        putOnConsole = true;
        console.putBy = this;
    }
}

