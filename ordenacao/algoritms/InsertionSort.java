package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        int size =sorted.length;
        int menor;
        int pointer = 0;
        for (int i = 0; i<size;i++){
            int  key = sorted[i];
            int j = i-1;
            while(j>=0 && sorted[j]>key){
                sorted[j+1] = sorted[j];
                j = j-1;
            }
            sorted[j+1]=key;
        }
        return sorted;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
