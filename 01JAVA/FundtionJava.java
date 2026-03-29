import java.util.Scanner;

public class FundtionJava {

    // take user name and print welcome message
    // public static String getUserName(String name){
    // return name;
    // }

    // public static void main(String[] args){
    // System.out.println("Hello World");

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your name: ");
    // String userName = sc.nextLine();
    // String name = getUserName(userName);
    // System.out.println("Welcome " + name);
    // }

    // // calculate sum of two numbers
    // public static int calculateSum(int a, int b){
    // return a + b;
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int sum = calculateSum(a, b);
    // System.out.println("The sum is: " + sum);
    // }

    // product of 2 nmbers
    // public static int productOfNumber(int a, int b){
    // return a * b;
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int product = productOfNumber(a, b);
    // System.out.println("The product is: " + product);
    // }

    // fibonaci series
    public static void calateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("please enter valid number");
            return;
        }

        int fibonacciNo = 1;
        for (int i = n; i > 0; i--) {
            fibonacciNo = fibonacciNo * i;
        }
        System.out.println("fiboni of n is: ");
        System.out.println(fibonacciNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calateFibonacci(n);
    }
}
