package Operator;
class increment {
     int a = 2;
     int b = 3;
     int display() {
         a++; // post 8
         ++b; // pre
         System.out.println(" the value of a after ++a is :" + a);
         System.out.println(" the value of a after ++b is: " + b);
         b=++a;
         System.out.println(" the value of a after b=a++ is: " + b);
         return 0;
     }
 }
public class increment_demo {
    public static void main(String[] args) {
        increment obj = new increment();
        obj.display();
        int i = 5;
        int j =6;
        int e =5;
        System.out.println(i);
        System.out.println(j);
        int c=i++ +i++ +i++;
        //c=   5 + 1+6   7  = 19
        int d = ++e + e++ + --e + e-- + ++e;  //24
        //  d = 6   7    6    5 6
        System.out.println(d);
        System.out.println(e);


        int o=10;
        int p=12;
        System.out.println("post increment of o : " +o++ );  // here print first and then increment
        System.out.println("pre increment of p :"  + ++p);   // here increment first then print
    }
}
