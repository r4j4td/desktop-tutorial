public class Main {
    public static void main(String[] args)
    {
//       int x = 18;
//       if(x>10 && x<=10)
//           System.out.println("hello");
//       else
//           System.out.println("bye");

        int x = 7;
        int y = 8;
        int z = 9;

        if(x>y && x>z)
            System.out.println(x);
        else if(y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}