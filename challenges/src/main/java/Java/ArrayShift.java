package Java;

public class ArrayShift {
    public static int[] insertShiftArray(int[] oldArray, int value) {
        int shiftedArray[] = new int[oldArray.length + 1];
        int i;
        int odd = oldArray.length % 2;
        int midPoint = oldArray.length / 2 + odd;

        for (i = 0; i < midPoint; i++) {
            shiftedArray[i] = oldArray[i];
        }
        shiftedArray[i] = value;
        i++;

        for (; i < oldArray.length + 1; i++) {
            shiftedArray[i] = oldArray[i - 1];
        }

        return shiftedArray;
    }
}
