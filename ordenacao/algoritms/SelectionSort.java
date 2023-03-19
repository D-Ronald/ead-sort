package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int[] sorted = elements.clone();
        int size = sorted.length;
        int lower = 0;
        int pointer = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                lower = sorted[i];
                if (sorted[j] < lower) {
                    lower = sorted[j];
                    pointer = sorted[i];
                    sorted[i] = lower;
                    sorted[j] = pointer;
                }
            }
        }
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
