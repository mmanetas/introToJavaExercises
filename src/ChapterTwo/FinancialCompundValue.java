/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class FinancialCompundValue {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the monthly savings amount: ");
    double monthlyAmount = input.nextDouble();
    double value;
    final double INTEREST = 0.00417;
    
    value = monthlyAmount * (1 + INTEREST); //after the first month
    value = (100 + value) * (1 + INTEREST); //after the second month
    value = (100 + value) * (1 + INTEREST); //after the third month
    value = (100 + value) * (1 + INTEREST); //after the fourth
    value = (100 + value) * (1 + INTEREST); //fifth
    value = (100 + value) * (1 + INTEREST); //sixth
    
    System.out.println("After the sixth month, the account value is: $" + value);
   
    }
}
   
    
