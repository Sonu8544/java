package Array;

public class FindMinimumNumber {
    public static void main(String[] args){
        int arr[] = new int[]{5, 2, 9, -1, 1, 5, 6};
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum number is: " + min);
    }
}
