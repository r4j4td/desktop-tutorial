// package typecasting;

public class typecasting {
    public static void main(String[] args) {
        // automatic or implicit casting
        short sh = 12;
        // short->int
        int intData = sh;
        float fl = 12.21f;
        // float -> double
        double db = fl;
        System.out.println(intData);
        System.out.println(db);
        // explicit or manual casting
        int intVar = 123456;
        // int->short
        short shl = (short)intVar;
        System.out.println(shl);
      
    }
    
}
