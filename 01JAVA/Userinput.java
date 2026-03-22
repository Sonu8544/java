import java.util.*;

public class Userinput {
    public static void main(String[] args){
        // Input
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name);
    }
}