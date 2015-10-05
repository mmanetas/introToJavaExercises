/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class CalcFutureInvestmentValue {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    
    System.out.print("Enter annual interest rate in percentage: ");
    double annualInterestRate = input.nextDouble()/100;
    double monthlyInterestRate = annualInterestRate/12;
    
    System.out.print("Enter number of years: ");
    double numberOfYears = input.nextDouble();
    double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),(numberOfYears * 12));
    
    System.out.println("Accumulated value is : $" + (float)futureInvestmentValue);
    }   
}
