/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class AreaofHexagon {
    public static void main(String[] args){
        //Create a scanner
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter a side
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area = ((3 * Math.pow(3,.5))/2)* Math.pow(side, 2);
        System.out.println("The area of a hexagon is " + (float)area);

            }
}
