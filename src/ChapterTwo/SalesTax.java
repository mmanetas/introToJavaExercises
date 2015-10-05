/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount; ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
      
        
        int j = 0;
        for(int i = 0; j < 10; j = i++) {
            System.out.println("Megan is " + i + " years old");
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
        for(int i = 0; j < 10; j = ++i) {
            System.out.println("Megan is " + i + " years old");
            System.out.println("i = " + i);
            System.out.println("j = " + j);
    }
    }
}
