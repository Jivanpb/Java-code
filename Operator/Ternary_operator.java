// write a program to check greter number
package Operator;
class ternery_example{
    int a,b;
    void checkGrk(){
        a=15;
        b=10;
        String s = (a>b) ? " a is greater ":" b is greater";
        System.out.println(s);
    }
}
public class Ternary_operator {
    public static void main(String[] args) {
    ternery_example obj = new ternery_example();
    obj.checkGrk();
    }
}
