/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int current_age = parseInt(input.nextLine());

        System.out.print("At what age would you like to retire? ");
        int retire_age = parseInt(input.nextLine());

        int time_left = retire_age - current_age;
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        int retire_date = current_year + time_left;

        System.out.println("You have " + time_left + " years left until you can retire.");
        System.out.println("It's " + current_year + ", so you can retire in " + retire_date + ".");

    }
}
