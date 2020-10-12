package algoritmos;

import java.util.Arrays;

public class MergeSort {

    /**
     * O MergeSort consiste em Dividir (o problema em vários subproblemas
     * e resolver esses subproblemas através da recursividade) e Conquistar 
     * (após todos os subproblemas terem sido resolvidos ocorre a conquista 
     * que é a união das resoluções dos subproblemas). 
     * Como o algoritmo Merge Sort usa a recursividade, há um alto consumo de memória 
     * e tempo de execução, tornando esta técnica não muito eficiente em alguns problemas.
     */

    public static void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;

            mergeSort(array, leftIndex, middleIndex);
            mergeSort(array, middleIndex + 1, rightIndex);

            merge(array, leftIndex, middleIndex, rightIndex);
        }
    }

    private static void merge(int array[], int leftIndex, int middleIndex, int rightIndex) {

        int n1 = middleIndex - leftIndex + 1;
        int n2 = rightIndex - middleIndex;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[leftIndex + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middleIndex + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = leftIndex;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }





    public static void main(String[] args) {
		int[] array = { 8, 2, 3, 4, 1, 10, 5, 7, 6, 9 };
		mergeSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
    }

}