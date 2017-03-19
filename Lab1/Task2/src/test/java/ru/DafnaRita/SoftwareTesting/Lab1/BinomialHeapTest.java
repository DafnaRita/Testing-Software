package ru.DafnaRita.SoftwareTesting.Lab1;


import org.junit.Before;
import org.junit.Test;

import static ru.DafnaRita.SoftwareTesting.Lab1.BinomialHeap.merge;

public class BinomialHeapTest {
    BinomialHeap heap1;
    BinomialHeap heap2;
    @Before
    public void init() {
        heap1 = new BinomialHeap();
        heap1.insert(3);
        heap1.insert(6);
        heap1.insert(7);
        heap1.insert(5);
        heap1.insert(17);

        heap2 = new BinomialHeap();
        heap2.insert(70);
    }

    @Test
    public void mergeTest() {
        System.out.println("!!!start testing!!!");
        BinomialHeap result = merge(heap1, heap2);
    }
}
