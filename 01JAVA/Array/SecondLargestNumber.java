package Array;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 2, 9, -1, 1, 5, 6 };
        // int temp = 0;
        // int size = arr.length;
        // for (int i = 0; i < size; i++) {
        //     for (int j = 0; j < size - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // System.out.println("The second largest number is: " + arr[size - 2]);



        // without sorting
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println("The second largest number is: " + secondMax);
    }
}
