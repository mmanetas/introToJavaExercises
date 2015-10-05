/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class PopProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years : ");
        long i = input.nextLong();
        
        long time, newPop, current = 312032486;
        double birth, death, immigrant;
        
        //Convert time to second
        time = i * 365 * 24 * 60 * 60;
        //Calculating population increase/decrease in each case
        birth = time / 7.0;
        death = time / 13.0;
        immigrant = time / 45.0;
        //Calculate new population
        newPop = current + (long)birth - (long)death + (long)immigrant;
        System.out.println("The population on year " + i + " is " + newPop);  
        }
    }


