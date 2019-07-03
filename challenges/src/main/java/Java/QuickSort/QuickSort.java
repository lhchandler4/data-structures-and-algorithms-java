package Java.QuickSort;

public class QuickSort {

    public static void quickSort(int[] arr, int left, int right){
        if (arr.length < 1) {
            throw new IllegalArgumentException("Array Is Empty");
        }
        if(left >= right){
            return;
        }
        int pivot = arr[(left + right)/2];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    public static int partition (int[] arr, int left, int right, int pivot){
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int [] arr, int left, int right){
        int temp = 0;
        temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}
