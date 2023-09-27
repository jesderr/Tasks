package Sorts;

public class ExcecutorSorts {
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int border = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < border) {
                i++;
            }
            while (array[j] > border) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }


}
