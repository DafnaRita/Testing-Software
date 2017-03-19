package ru.DafnaRita.SoftwareTesting.Lab1;

import static ru.DafnaRita.SoftwareTesting.Lab1.BinomialHeap.merge;

/**
 * Created by Margo on 19.03.2017.
 */
public class Main {
    public static void main(String[] argv){
        BinomialHeap heap1 = new BinomialHeap();
        heap1.insert(3);
        heap1.insert(6);
        heap1.insert(7);
        heap1.insert(5);
        heap1.insert(17);

        BinomialHeap heap2 = new BinomialHeap();
        heap2.insert(70);
        System.out.println("!!!start testing!!!");
        BinomialHeap result = merge(heap1, heap2);
    }
}
