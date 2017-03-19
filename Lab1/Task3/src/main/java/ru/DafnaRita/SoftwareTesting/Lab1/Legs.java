package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Margo on 18.03.2017.
 */
public class Legs {

    private boolean onControlPanel;

    public boolean isOnControlPanel() {
        return onControlPanel;
    }

    Boolean putOnControlPanel(Boolean b){
       return this.onControlPanel = b;
    }
}

