/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

/**
 *
 * @author manetasm
 */
public class ArithmeticEquationCheckPoint {
    public static void main(String[] args) {
        //Declare Variables
        double a = 1;
        double b = 5;
        double c = 6;
        
        double x1 = 0;
        double x2 = 0;
        
        //Process Inputs
        x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        //Output results
        System.out.println(x1 );
        System.out.println(x2 );
    }
}
