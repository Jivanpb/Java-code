// program to create marksheet in java using if else statemenet
package Statement;
import java.util.Scanner;

class Marksheet {
    int m1, m2, m3, m4, m5;
    String s1, s2, s3, s4, s5;
    Scanner sc = new Scanner(System.in);

    void calc_Marks() {
        System.out.println("Enter subject name and marks");
        s1 = sc.next();
        m1 = sc.nextInt();
        System.out.println("Enter subject name and marks");
        s2 = sc.next();
        m2 = sc.nextInt();
        System.out.println("Enter subject name and marks");
        s3 = sc.next();
        m3 = sc.nextInt();
        System.out.println("Enter subject name and marks");
        s4 = sc.next();
        m4 = sc.nextInt();
        System.out.println("Enter subject name and marks");
        s5 = sc.next();
        m5 = sc.nextInt();

        if ((m1 >= 0 && m1 <= 100) && (m2 >= 0 && m2 <= 100) && (m3 >= 0 && m3 <= 100) &&
                (m4 >= 0 && m4 <= 100) && (m5 >= 0 && m5 <= 100)) {
            int c = 0;
            int mark = 0;
            String sub="";
            String dist="";
            if(m1>=75){
                dist+=s1+ " ";
            }
            if(m2>=75){
                dist+=s2+ " ";
            }
            if(m3>=75){
                dist+=s3+ " ";
            }
            if(m4>=75){
                dist+=s4+ " ";
            }
            if(m5>=75){
                dist+=s5+ " ";
            }
            if (m1 < 33) {
                mark = m1;
                sub+=s1+"";
                c++;
            }
            if (m2 < 33) {
                mark = m2;
                sub+=s2+" ";
                c++;
            }
            if (m3 < 33) {
                mark = m3;
                sub+=s3+" ";
                c++;
            }
            if (m4 < 33) {
                sub+=s4+" ";
                mark = m4;
                c++;
            }
            if (m5 < 33) {
                sub+=s5+" ";
                mark = m5;
                c++;
            }

            if (c == 0 || (c == 1 && mark >= 28)) {
                float res;
                if (c == 0) {
                    res = (m1 + m2 + m3 + m4 + m5) / 5.0f;
                } else {
                    res = (m1 + m2 + m3 + m4 + m5 + (33 - mark)) / 5.0f;
                }

                if (res >= 35 && res <= 45) {
                    System.out.println("Pass with third division");
                } else if (res < 60) {
                    System.out.println("Pass with second division");
                } else {
                    System.out.println("Pass with first division");
                } if(c==1){
                    System.out.println("Note:-you are passed with grace and gracemark is :" +(33-mark)
                    +" mark grace subject is "+sub);
                }
                if(dist !=""){
                    System.out.println("Distinction subject name is "+dist);
                }

            } else if (c == 1) {
                System.out.println("Try again, you are a supplementri in "+sub);
            } else {
                System.out.println("Sorry, you have failed in following subject "+sub);
            }
        } else {
            System.out.println("Invalid marks");
        }
    }
}

public class marksheet_program {
    public static void main(String[] args) {
    Marksheet obj= new Marksheet();
    obj.calc_Marks();
    }
}
