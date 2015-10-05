 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;
public class CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        long n = input.nextInt();
        
        //Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        //Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        //Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        //Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        //Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;
        //Obtain the total hours
        long totalHours = totalMinutes / 60;
        //Compute the current hour
        long currentHour = totalHours % 24;
        
       //Computer the current hour -5
        long offsetHour = currentHour + n;
        
        //Display results
        System.out.println("The current time is " + offsetHour + " : " + currentMinute + " : " + currentSecond);
    }
}