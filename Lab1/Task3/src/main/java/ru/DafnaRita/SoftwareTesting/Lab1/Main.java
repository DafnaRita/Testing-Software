package ru.DafnaRita.SoftwareTesting.Lab1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Margo on 18.03.2017.
 */
public class Main {
    Head createHead(Side side) {
        return new Head(new Teeth(), side);
    }

    Somebody createSomebody() {
        Main main = new Main();

        Hand left = new Hand(Side.LEFT);
        Hand right = new Hand(Side.RIGHT);

        Legs legs = new Legs();
        return new Somebody(
                left,
                right,
                legs,
                main.createHead(Side.RIGHT),
                main.createHead(Side.LEFT)
        );
    }

    public static void main(String[] args) {
        Main main = new Main();
        Somebody somebody = main.createSomebody();

        Stuff stuff = new Stuff(5);

        Eyes eyes = new Eyes();
        Arthur arthur = new Arthur(eyes);//
        arthur.comeIn();
        arthur.see(somebody);//changeEmotion

        somebody.pickInTeeth(Side.LEFT, Side.RIGHT);
        somebody.pickInTeeth(Side.LEFT, Side.RIGHT);
    }
}

