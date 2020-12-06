package task03;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] startMas = new int[]{10, 1, 5, 5, 5, 6, 7, 7, 1, 10, 5, 10, 6, 9, 7};
        HashMap<Integer, Integer> mas = IgnoreDuplicateMas.slowDuplicateSortedMethod(startMas);
        IgnoreDuplicateMas.printDuplicateNumber(mas);
    }
}
