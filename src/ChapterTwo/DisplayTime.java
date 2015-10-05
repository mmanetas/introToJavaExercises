import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        
        int minutes = seconds / 60; //Find minutes in seconds
        int remainingSeconds = seconds % 60; //Seconds remaining
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds ");
        System.out.println("Two to the third power equals: " + Math.pow(2, 3));
        System.out.println(56 % 6);
        System.out.println(78 % -4);
        System.out.println(1 % 5);
        System.out.println("Today is Tuesday, so it will be " + ((2 + 100) & 7) + " in 100 days!");
        System.out.println(25 / 4);
        System.out.println(25.0 / 4);
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);
        System.out.println("25 / 4 is " + 25 /4);
        System.out.println("25 / 4 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2/4 is " + 3.0 * 2 / 4);
        System.out.println("Two to the 3.5th power is " + Math.pow(2, 3.5));
    
        int m = 5;
        int r = 7;
        System.out.println("mr ^2 is " + Math.pow(m * r, 2));
        System.out.println((m * r) * 35);
        
                
    }
    
}
