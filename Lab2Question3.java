/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2question3;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Lab2Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Prompt the user to enter an amount of time in secounds
        System.out.println("Please enter a random amount of seconds :");

        int seconds = keyboard.nextInt();

        //Converting seconds in minutes
        int min = seconds / 60;

        //Remainder of the minutes(to find the seconds along with the minutes)
        int secondsmin = min % (seconds - min);

        System.out.println("Time in minute-seconds :" + min + ":" + secondsmin);
    }

}
