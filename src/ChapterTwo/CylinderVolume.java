/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args){
    //Create a scanner object
    Scanner input = new Scanner(System.in); 
    
    //Prompt the user to enter a radius
    System.out.print("Enter a number for radius & length :");
    double radius = input.nextDouble();
    double length = input.nextDouble();

    
    double area = radius * radius * 3.14159;
    double volume = area * length;
    
    //Display results
    System.out.println("With a radius of " + radius + " and a length of " + length + " the area is : " + (float)area);
    System.out.println("   the volume is " + (float)volume);
    
    
    }
}
