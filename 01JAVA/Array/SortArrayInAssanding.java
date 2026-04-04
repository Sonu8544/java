package Array;

import java.util.Arrays;

public class SortArrayInAssanding {
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 2, 9, -1, 1, 0, 5, 6 };
        int temp = 0;
        int size = arr.length;

        for(int i=0; i<size; i++){
            for(int j = 0; j<size-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array in assanding order: " + Arrays.toString(arr));
    }
}
