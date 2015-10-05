/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter weigth in lbs
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        //Prompt the user to enter height in 
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        
        double weightinKgs = ( weight * .45359237) ;
        double heightinMts = (  height * .0254 ) ;
        
        double BMI = weightinKgs / Math.pow(heightinMts,2);
        System.out.println("BMI is " + (float)BMI);
        
    }
}
