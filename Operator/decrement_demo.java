package Operator;
public class decrement_demo {
    public static void main(String[] args) {
        int a=10;
        int b =12;
        System.out.println("Actual value of a  is :" +a);
        System.out.println("Actual value of b is : " +b);
        System.out.println();
        System.out.println("pre drecement of a :" + --a); // in pre decrement value decrement first and then print
        System.out.println("post drecement of b :" + b--); // in post decrement value print first then decrements
        int c =10;
        int d= --c+ c--;
        //  18= 9 + 8
        System.out.println(d);
        //   19= 9 +
        System.out.println(c);
    }
}
