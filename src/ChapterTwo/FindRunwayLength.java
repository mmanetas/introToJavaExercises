/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class FindRunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = Math.pow(v,2) / (2*a);
        System.out.println("The minimum runway length is : " + (float)length );
    }
        
}
