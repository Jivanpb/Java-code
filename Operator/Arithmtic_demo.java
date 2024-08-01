package Operator;

public class Arithmtic_demo {
    public static void main(String[] args) {
        int a =10;
        int b =2;
        System.out.println("Addition of a and b is " +(a+b));
        System.out.println("Substraction of a and b is :" +(a-b));
        System.out.println("Division of a and b is :"+(a/b));
        System.out.println("Multiplication of a and b is :" +(a*b));

        // % module operator in java
        // 1) for int number
        int c =10;
        int d=3;
        int result=c%d;
        System.out.println("The result of c% is :" +result );

        //2) for floating point numbers
        double e = 10.5;
        double f = 3.2;
        double resultfp = e % f;
        System.out.println("the relultfp of e%f  is "+resultfp);




    }
}
