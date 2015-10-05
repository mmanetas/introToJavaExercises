/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter balance and interest rate (e.g., 3 for 3% : ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        
        double interest = balance * (annualInterestRate/1200);
        System.out.println("The interest is " + (float)interest);
    }
}
