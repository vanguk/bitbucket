package com.main;

public class Main {

    public static void main(String[] args) {
        MyIntegerCollection m1 = new MyIntegerCollection();
        m1.add(1);
        m1.add(2);
        m1.add(3);
        m1.add(4);
        m1.add(5);
        m1.add(6);
        m1.add(7);
        m1.add(8);
        m1.add(9);
        m1.add(10);
        for (Integer item : m1.getMas()) {
            if (item != null) System.out.print(item + " ");
        }
        System.out.println("\n");
        System.out.println(m1.arithmeticAverage());
        System.out.println(m1.minElement());
        System.out.println(m1.maxElement());
        System.out.println(m1.indexOf(66));
        System.out.println(m1.valueOf(2));
        System.out.println("\n" + "=====================================================");
        System.out.println(m1.isFull());
        System.out.println(m1.getCapacity() + " " + m1.getMas().length + " " + m1.getSize());
    }
}
