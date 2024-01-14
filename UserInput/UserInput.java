import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st value: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the 2nd value: ");
        int num2 = scan.nextInt();
        System.out.println("Sum = "+(num1+num2));
    }
}
