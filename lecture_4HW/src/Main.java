import java.util.*;
public class Main {
    public static void main(String[] args) {
//        print all even number till n

//        int n = 50;
//        for(int i=1; i<=n; i++){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//        }
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("this is good");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("this is also good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("this is good as well");
            } else {
                System.out.println("invalid");
            }
            System.out.println("want to continue ? (yes(1) or no(0))");
            input = sc.nextInt();
        } while (input == 1);

    }
}
