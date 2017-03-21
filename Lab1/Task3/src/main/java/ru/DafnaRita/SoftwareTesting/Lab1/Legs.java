package ru.DafnaRita.SoftwareTesting.Lab1;

public class Legs {
    public boolean putOnConsole;

    void putOnConsole (Console console){
        this.putOnConsole = true;
        console.putBy = this;
    }
}

