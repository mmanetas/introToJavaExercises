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
public class ExtraIncrementalWork {
    public static void main(String[] args) {
    int j = 0;
       for(int i = 0; j < 10; j = i++) {
            System.out.println("Megan is " + i + " years old");
            System.out.println("i = " + i);
            System.out.println("j = " + j);
    }
    float f = 12.5F;
    int a = (int)f;
    System.out.println("f is " + f);
    System.out.println("a is " + a);
    
    double amount = 5;
    System.out.println(amount / 2);
    System.out.println(5 / 2);
    }
}
    
