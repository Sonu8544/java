import java.util.Scanner;

public class FundtionJava {
 
    public static String getUserName(String name){
        return name;
    }

    public static void main(String[] args){
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = sc.nextLine();
        String name = getUserName(userName);
        System.out.println("Welcome " + name);
    }
}
