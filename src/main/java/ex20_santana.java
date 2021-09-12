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
        System.out.println("Enter you height in inches: ");
        Scanner in1 = new Scanner(System.in);
        String h = in1.nextLine();
        double n1 = Double.parseDouble(h);
        System.out.println("Enter you weight in pounds: ");
        Scanner in2 = new Scanner(System.in);
        String w = in1.nextLine();
        double n2 = Double.parseDouble(w);

        double bmi = ((n2 / (n1 * n1))*703.00);
        System.out.println("Your BMI is "+Math.round(bmi*100.0)/100.0+".");

        if (bmi >= 18.5 && bmi <= 25.0)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else if (bmi < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if (bmi > 25)
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
