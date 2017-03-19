package ru.DafnaRita.SoftwareTesting.Lab1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Максимов on 17.03.2017.
 */
public class Somebody  {
    Map<Side, Head> heads;
    List<Hand> hands;
    boolean inChair;
    Legs legs;

    Somebody(List<Hand> hands, Legs legs, Head... h){
        this.hands = hands;
        this.legs = legs;
        this.heads = new HashMap<Side, Head>();
        for(Head head : h) {
            heads.put(head.getSide(), head);
        }
    }

    Head getHead(Side side) throws Exception{
        if (heads.get(side).equals(null)) {
            return heads.get(side);
        }
        else {
            throw new Exception("There isn't the kind of head");
        }
    }

    public Legs getLegs() {
        return legs;
    }

    Hand getHand(Side side) throws Exception {
        for(int i = 0; i < hands.size(); i++) {
            if(hands.get(i).side == side) {
                return hands.get(i);
            }
        }
        throw new Exception("There isn't the kind of hand");
    }

    Boolean pickIn(Teeth teeth) {
        return true;
    }

    void layInChair(Boolean b){
        inChair = b;
    }
}