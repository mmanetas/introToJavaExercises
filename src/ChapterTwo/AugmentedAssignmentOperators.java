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
public class AugmentedAssignmentOperators {
    public static void main(String[] args) {
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
        
        int c = 6;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        c = 6;
        d = ++c;
        System.out.println(c);
        System.out.println(d);
        
        for(int i = 0; i < 20; i++){
            System.out.println("Megan is " + i + " years old");
        }
    }
}
