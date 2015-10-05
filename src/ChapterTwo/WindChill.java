/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the temperature in Fahrenheit between -58F and 41F :");
      double ta = input.nextDouble();
      System.out.print("Enter the wind speed (>=2) in mph :");
      double v = input.nextDouble();
      double twc = 35.74 + .6215 * ta - 35.75 * Math.pow(v,.16) + .4275 * ta * Math.pow(v, .16);
      
      System.out.println("The wind chill index is " + (float)twc);
    }
}
