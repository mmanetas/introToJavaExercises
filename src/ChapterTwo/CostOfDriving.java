/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the driving distance: ");
        float distance = input.nextFloat();
        
        System.out.print("Enter mpg: ");
        float mpg = input.nextFloat();
        
        System.out.print("Enter price per gallon: ");
        float pricePerGallon = input.nextFloat();
        
        float cost = distance/mpg * pricePerGallon;
        System.out.println("The cost of driving is $ " + (int)(cost * 100)/100.0);
        
    }
}
