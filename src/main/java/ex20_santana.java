import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
What is the order amount? 10
What state do you live in? Wisconsin
What county do you live in? Dane
The tax is $0.50.
The total is $10.50.
 */

public class ex20_santana
{
    public static void main( String[] args ) {
        System.out.println("What is the order amount? ");
        Scanner in1 = new Scanner(System.in);
        String order = in1.nextLine();
        double n1 = Double.parseDouble(order);
        System.out.println("What state do you live in? ");
        Scanner in2 = new Scanner(System.in);
        String state = in2.nextLine();
        System.out.println("What county do you live in? ");
        Scanner in3 = new Scanner(System.in);
        String county = in3.nextLine();
        double tax=0;
        if(state.equals("Wisconsin")||state.equals("wisconsin"))
        {
            tax = 0.05;
        }
        else if(state.equals("Illinois")||state.equals("illinois"))
        {
            tax = 0.08;
        }
        else
        {
            tax = 0;
        }
        if((state.equals("Wisconsin")||state.equals("wisconsin")) && (county.equals("Dunn")) || county.equals("dunn"))
        {
            tax += 0.004;
        }
        else if((state.equals("Wisconsin")||state.equals("wisconsin")) && (county.equals("Eau Claire")) || county.equals("eau claire"))
        {
            tax += 0.005;
        }
        double tottax = n1*tax;
        double total = tottax + n1;
        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.",tottax,total);
    }
}
