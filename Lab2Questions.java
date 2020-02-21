/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2questions;
import java.util.Scanner;

/**
 *
 * @author cstuser
 */
public class Lab2Questions {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here

        Scanner keyboard= new Scanner(System.in);


       //Prompting the user to ennter their weight and height
        System.out.println("Please enter your weight in pounds(lbs) :");

        //Declaring a weight variable
        double weight=keyboard.nextDouble();

        //Converting from pounds to kilos
        double weightKgs=weight/2.205;
        System.out.println("Your weight in kgs is :" + weightKgs);


        System.out.println("Please enter your height in feet(lbs) :");

        //Declaring a height variable
        double height= keyboard.nextDouble();

        //Converting from feet to meters
        double heightMeters= height/3.281;
        System.out.println("Your height in meters is :" + heightMeters);


        //Calculating BMI
        double BMI= (weightKgs/Math.pow(heightMeters, 2));

        System.out.println("Your BMI is :" + BMI);
    }

}
