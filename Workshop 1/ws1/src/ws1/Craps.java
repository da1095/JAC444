/**********************************************
Workshop 1
Course: JAC444 - Fall Semester 2022
Last Name: Ahir Ahir
First Name: Devang
ID: 153484209
Section: NCC 
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:<submission date>
**********************************************/
package ws1;

import java.util.Random;
public class Craps {
    public static boolean point(int t) {
        Random rand = new Random();
        System.out.println("Point is (established) set to " + t);
        while(true) {
            int dice1 = 1 + rand.nextInt(6);
            int dice2 = 1 + rand.nextInt(6);
            int total = dice1 + dice2;
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + total);
            if (total == 7 ) {
                return false;
            } else if (total == t) {
                return true;
            }
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int dice1 = 1+rand.nextInt(6);
        int dice2 = 1+rand.nextInt(6);
        int T = dice1+dice2;
        boolean winner;
        if(T == 2 || T== 3 || T==12){
            winner = false;
        }
        else if(T==7|| T==11){
            winner =true;
        }
        else{
            winner = point(T);
        }
        if(winner){
            System.out.println("Congratulations, You win");
        }
        else {
            System.out.println("Craps, Better Luck Next Time, You lose");
        }
    }
}
