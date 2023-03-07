package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        int size =sorted.length;
        int menor = 0;
        int pointer = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                menor = sorted[i];
                if (sorted[j] < menor) {
                    menor = sorted[j];
                    pointer = sorted[i];
                    sorted[i] = menor;
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
