/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2question4;

import java.util.Scanner;

/**
 *
 * @author cstuser
 */
public class Lab2Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);

        //Prompting the user to enter temperature in Celcius for 3 days
        System.out.println("Enter the temperature in day1(Celcius) :");
        double t1 = keyboard.nextDouble();

        System.out.println("Enter the temperature in day2(Celcius) :");
        double t2 = keyboard.nextDouble();

        System.out.println("Enter the temperature in day3(Celcius) :");
        double t3 = keyboard.nextDouble();


        //Calculating the average temperature
        double averageTemperature=((t1+t2+t3)/3);
        System.out.println("The average temperature in the last 3 days is:" + averageTemperature);



    }

}
