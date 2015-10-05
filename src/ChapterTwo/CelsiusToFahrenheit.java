/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        
        //Convert Celsius to Fahrenheit
        double fahrenheit = (9/5.0) * celsius + 32;
        System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");             
        
    }
}

