import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
//        outer loop for rows part
//        for(int i=1; i<=a; i++){
////        inner loop for coloumn part
//            for(int j=1; j<=b; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
//              cell -> (i,j)
                if(i == 1 || j == 1 || i == a || j == b){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

















