package algoritmos;

import java.util.Arrays;

public class SelectionSort {
	
   /** SelectionSort é um algoritmo de ordenação baseado em se passar sempre 
    *  o menor valor do vetor para a primeira posição
    *  (ou o maior dependendo da ordem requerida), depois o de segundo menor valor
    *  para a segunda posição, e assim é feito sucessivamente com os n-1 elementos 
    *  restantes, até os últimos dois elementos.
    **/

	public static void selectionSort(int[] array) {
		int minIndex;

		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}

			swap(array, i, minIndex);
		}
	}

    private static void swap(int[] array, int index1, int index2) {
		int aux = array[index1];
		array[index1] = array[index2];
		array[index2] = aux;
	}

	public static void main(String[] args) {
		int[] array = { 8, 2, 3, 4, 1, 10, 5, 7, 6, 9 };
		selectionSort(array);
		System.out.println(Arrays.toString(array));
    }
    



    
}