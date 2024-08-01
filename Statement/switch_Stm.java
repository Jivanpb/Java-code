/*
    Switch statement in java
     1)it is used to solve option based program.
    `2)if we have multiple options and,we want to select particular option statement then we will prefer
     switch case.
     3) switch is called option based statement.
        Syntax
        switch(option)
        {
        case optionvalue:
        statement.
        break;
        ...---->triple . means multiple statements can write
        default;
        statement;
        }

       4)at runtime option will check optionvalue
       option=optionvalue;
       then that statement will execute.
       5)option value must be in ordered.

 */
package Statement;

import java.util.Scanner;

public class switch_Stm {
    public static void main(String[] args){
        int month;
        System.out.println("enter the number of month you want to see .!!");
        Scanner sc = new Scanner(System.in);
        month=sc.nextInt();
        //String monthName;
        switch(month){
            case 1:
                System.out.println("1st month of year is January");
                break;
            case 2:
                System.out.println("2nd month of year is February");
                break;
            case 3:
                System.out.println("3rd month of year is March");
                break;
            case 4:
                System.out.println("4th month of year is April");
                break;
            case 5:
                System.out.println("5th month of year is May");
                break;
            case 6:
                System.out.println("6th month of year is June");
                break;
            case 7:
                System.out.println("7th month of year is July");
                break;
            case 8:
                System.out.println("8th month of year is August");
                break;
                case 9:
                System.out.println("9th month of year is September");
                break;
                case 10:
                System.out.println("10st month of year is Octomber");
                break;
                case 11:
                System.out.println("11st month of year is November");
                break;
                case 12:
                System.out.println("12st month of year is December");
                break;
               default:
                System.out.println("you entered wrong value." +
                        "Please enter value in one to twelve ");
                break;
        }
    }
}
