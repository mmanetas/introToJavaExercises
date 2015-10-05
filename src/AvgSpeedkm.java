/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manetasm
 */
public class AvgSpeedkm {
    public static void main(String[] args) {
     double distance = 24, time = 1.0+40.0/60+35.0/60/60;
     //convert distance to miles and time to hour
     distance = distance * 1.6;
     System.out.println("The average speed is " + distance / time + " kilometers per hour.");
    }
}
