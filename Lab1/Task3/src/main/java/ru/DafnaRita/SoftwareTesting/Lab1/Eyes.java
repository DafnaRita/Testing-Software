package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Margo on 18.03.2017.
 */
public class Eyes {
    Boolean belief;
    public void believe(Boolean b){
        this.belief = b;
    }

    public int lookAtStuff(Stuff stuff) {
        return stuff.raise();
    }
}
