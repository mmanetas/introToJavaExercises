/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class PhysicsAcceleration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1 and t : ");
        float v0 = input.nextFloat();
        float v1 = input.nextFloat();
        float t = input.nextFloat();
        float a = ( v1 -  v0 ) / t;
        
        System.out.println("The average acceleration is: " + a);
        
    }
}
