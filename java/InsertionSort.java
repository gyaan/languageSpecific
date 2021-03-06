import java.util.Arrays;

/**
 * Created by gyaneshwar on 28/08/16.
 */
public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] targetArray = {230, 1, 4, 2, 5, 34, 23, 67};
        int[] sortedArray = insertionSort.insertionSort(targetArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    /**
     * @param arr
     * @return
     */
    public int[] insertionSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }

}
