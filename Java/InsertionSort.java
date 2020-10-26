public class InsertionSort {

    public static void swap (int [] arr, int pos1, int pos2){
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }

    public static void insertionSort(int [] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                swap (arr, i, i-1);
                i = 0;
            }
        }
    }
}
