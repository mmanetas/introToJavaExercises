/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class CalcEnergy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms : ");
        float M = input.nextFloat();
        System.out.println("Enter the initial temperature : ");
        float initialTemperature = input.nextFloat();
        System.out.println("Enter the final temperature : ");
        float finalTemperature = input.nextFloat();
        float Q = M * (finalTemperature - initialTemperature) * 4184;
        
        System.out.println("The energy needed is : " + Q);
    }
    
    
}
