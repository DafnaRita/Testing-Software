package ru.DafnaRita.SoftwareTesting.Lab1;

/**
 * Created by Margo on 18.03.2017.
 */
public class Stuff {
    int count;
    Stuff(int count) {
        this.count = count;
    }

    public int raise() {
        count = count + 1;
        return count;
    }
}
