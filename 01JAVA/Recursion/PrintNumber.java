package Recursion;

public class PrintNumber {
    public static void printNumber(int n) {
        if (n == 11) {
            return;
        }
        
        System.out.println("N = " + n);
        printNumber(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }

}
