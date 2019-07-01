package Java.InsertionSort;

public class InsertionSort {

    public static void insertionSort(int [] arr){
        if(arr.length == 0){
            throw new IllegalArgumentException("Array Is Empty");
        }
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int tempArr = arr[i];

            while(j >= 0 && tempArr < arr[j]){
                arr[j + 1] = arr[j];
                j = j-1;

            }
            arr[j + 1] = tempArr;
        }
    }
}
