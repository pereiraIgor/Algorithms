package algoritmos;

import java.util.Arrays;

public class RecursiveBubbleSort {
	
    // BubbleSort Recursivo
        
    public static void RecursiveBubbleSort(int[] array, int n) {
        // CASO BASE.
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if (array[i] > array[i+1]) {
                swap(array, i, i+1);
            }
        }
        RecursiveBubbleSort(array, n-1);
    }

    private static void swap(int[] array, int index1, int index2) {
		int aux = array[index1];
		array[index1] = array[index2];
		array[index2] = aux;
	}

	public static void main(String[] args) {
		int[] array = { 8, 2, 3, 4, 1, 10, 5, 7, 6, 9 };
		RecursiveBubbleSort(array, array.length);
		System.out.println(Arrays.toString(array));
    }
    



    
}

