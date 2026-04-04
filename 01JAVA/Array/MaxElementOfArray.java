package Array;

public class MaxElementOfArray {
    public static void main(String[] args){
        int arr[] = new int[]{5, 2, 9, -1, 1, 5, 6};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}
