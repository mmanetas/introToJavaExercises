/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
    //Create a scanner object
    Scanner input = new Scanner(System.in); 
    
    //Prompt the user to enter a radius
    System.out.print("Enter a value for feet :");
    double feet = input.nextDouble();

    
    double meters = feet * .305;
            
    //Display results
    System.out.println(feet + " feet is " + meters + " meters ");
 
    //LbsToKilos
    System.out.print("Enter a number in pounds: ");
    double pounds = input.nextDouble();
    double kilograms = pounds * .454;
    
    //Display results
    System.out.println(pounds + " pounds " + " is " + kilograms + " kilograms ");
    
    System.out.print("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble(), gratuityRate = input.nextDouble();
    double gratuity = subtotal * (gratuityRate /100);
    double total = subtotal + gratuity;
    
    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    
    //
    }
}
