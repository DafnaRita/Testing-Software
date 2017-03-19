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

        List<Hand> hands = new ArrayList<Hand>();

        Hand left = new Hand(Side.LEFT);
        Hand right = new Hand(Side.RIGHT);
        hands.add(left);

        Legs legs = new Legs();
        return new Somebody(
                hands,
                legs,
                main.createHead(Side.RIGHT),
                main.createHead(Side.LEFT)
        );
    }

    public static void main(String[] args) {
        Main main = new Main();
        Somebody somebody = main.createSomebody();
        somebody.layInChair(true);

        try {
            Hand hand = somebody.getHand(Side.RIGHT);
            hand.pickIn(
            somebody.getHead(Side.RIGHT).getTeeth()
            );
            somebody.getLegs().putOnControlPanel(true);
            somebody.getHead(Side.LEFT).smile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Stuff stuff = new Stuff(5);

        Arthur arthur = new Arthur(new Eyes(), Emotions.NERVOUNESS);
        arthur.comeIn();
        arthur.getEyes().lookAtStuff(stuff);
        arthur.getEyes().believe(false);
        arthur.jawIsLost();
    }
}
