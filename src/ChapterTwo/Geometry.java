/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args){
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter x1 and y1
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        //Prompt the user to enter x2 and y2 
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), .5);
        System.out.println("The distance between the two points is " + distance);
    }
}
