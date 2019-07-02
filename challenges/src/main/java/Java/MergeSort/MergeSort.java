package Java.MergeSort;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr){
        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("Array Is Empty");
        }
        splitArr(arr);
        return arr;
    }

    private static void splitArr(int[] arr){
        int n = arr.length;
        if (arr.length < 2)return;
        int mid = n /2;
        int[] bArr = Arrays.copyOfRange(arr, 0, mid);
        int[] cArr = Arrays.copyOfRange(arr, mid, n);
        splitArr(bArr);
        splitArr(cArr);
        mergeArr(bArr, cArr, arr);
    }

    private static int[] mergeArr(int[] bArr, int[] cArr, int[] arr ){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < bArr.length && j < cArr.length){
            if (bArr[i] <= cArr[j]){
                arr[k] = bArr[i];
                i++;
            } else {
                arr[k] = cArr[j];
                j++;
            }
            k++;
        }
        if (i == bArr.length){
            while (j < cArr.length){
                arr[k] = cArr[j];
                k++;
                j++;
            }
        } else {
            while (i < bArr.length){
                arr[k] = bArr[i];
                k++;
                i++;
            }
        }
        return arr;
    }
}

