/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manetasm
 */
public class KramersRule {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = .55;
        double f = 5.9;
        
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e*c) / (a*d-b*c);
        System.out.print("X equals: " + (int)(x * 100) / 100.0  +"\n y equals: " + (int)(y * 1000) / 1000.0 );
        
  
    }
    
}
