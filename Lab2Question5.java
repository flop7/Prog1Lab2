/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2question5;
import java.util.Scanner;

/**
 *
 * @author cstuser
 */
public class Lab2Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);

        //Prompting the user to enter first and last name
        System.out.println("Enter name(last,first);");

        String fullname= keyboard.nextLine();

        int index= fullname.indexOf(',');

        //Format
        String last= fullname.substring(0,index);
        String first=fullname.substring(index ,2);

        //Switching the first name to uppercase letters
        first =(first.substring(0,1)).toUpperCase()+ first.substring(1);

        //Switching the last name to uppercase letters
        last= last.substring(0,1).toUpperCase() +  last.substring(1);

        System.out.println("Formatted name: "+ first+""+last);

    }

}
