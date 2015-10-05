/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

/**
 *
 * @author manetasm
 */
public class ComputeChangeRewrite {
    public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    //Receive the amount
    System.out.print("Enter the input as an integer whose last two digits represent cents: ");
    int amount = input.nextInt();
    
    int remainingAmount = amount;
    
    //Find number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;
    
    //Find the number of quarters in the remaining amount
    int numberOfCents = remainingAmount;
    
    
    //Display results
    System.out.println("Your amount " + amount + " consists of ");
    System.out.println("   " + numberOfOneDollars + " dollars and " + numberOfCents + " cents ");
 
}
}
