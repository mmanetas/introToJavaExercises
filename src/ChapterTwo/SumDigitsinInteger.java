/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class SumDigitsinInteger {
    public static void main(String[] args) {
      //Enter integer & add the digits 
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a number between 0 and 1000 : ");
        int n = input.nextInt();
        
        int ones = n % 10;
        int tens = (n / 10) % 10;
        int hundreds = (n / 100) % 10;
        int answer = ones + tens + hundreds;
        
        System.out.println("The sum of " + n + " is " + answer);
    
    //Find the number of years and days in minutes entered
    //Already created a scanner
        int minutes, years, days, minutesPerDay, minutesPerYear;
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextInt();
        
        minutesPerDay = 60 * 24;
        minutesPerYear = minutesPerDay * 365;
        
        //Calc number of years 
        years = minutes / minutesPerYear;
        
        //Calc number of days
        days = (minutes / minutesPerDay) % 365;
        
        //Display results
        System.out.println(minutes + " minutes " + " is approx " + years + " years " + " and " + days + " days ");
        
        
    }
}
