package org.prog3.lab.week5.main;

import org.prog3.lab.week5.kernel.SortableArray;
import org.prog3.lab.week5.module.SortableListImpl1;

public class KernelModuleMain {

    public static void main(String[] args) {

        SortableArray<String> kernel = new SortableArray<>();
        kernel.addModule(new SortableListImpl1<>());

        kernel.add("farfalla");
        kernel.add("ragno");
        kernel.add("zanzara");
        kernel.add("mosca");
        kernel.sort();
        kernel.print();
        kernel.remove("ragno");
        System.out.println();
        kernel.print();

        System.out.println();
        SortableArray<Integer> kernel1 = new SortableArray<>();
        kernel1.addModule(new SortableListImpl1<>());
        kernel1.add(20);
        kernel1.add(30);
        kernel1.add(10);
        kernel1.add(5);
//        kernel1.add("ciao"); // error: incompatible types...
        kernel1.sort();
        kernel1.print();
    }
}
