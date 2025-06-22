import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + "Welcome to the World of Humans");
        sc.close();
    }
}
