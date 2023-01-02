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

import java.util.Scanner;

public class MaxLocation {
	//Getting the maximum value
	public static double MaxValue(double [][] Arr){
		double maxvalue = Arr [0][0];
		
		//comparing the array values
		for (int x=0; x<Arr.length; x++) {
			for (int y=0; y<Arr[x].length; y++) {
				if(maxvalue < y) {
					maxvalue = y;
				}
			}
		}
		return maxvalue;
	}
	
	//getting the index location
	public static int[] Index(double [][] Arr){
		double maxValue= Arr[0][0];
        int[] location= new int [2];
        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr[i].length;j++){
                if(maxValue < Arr[i][j]){
                    location[0]=i;
                    location[1]=j;

				}
			}
		}
		return location;
	}
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int Row = input.nextInt();
		int Column = input.nextInt(); //taking the dimensions for the array from the user 
		
		double Array [][] = new double [Row][Column]; //creation of 2D Array
		System.out.println();
		
		System.out.println("Enter the array:");
		for(int i=0; i < Row; i++) {
			for (int j=0; j < Column; j++)
			{
				Array[i][j] = input.nextDouble();
			}
		}
		
		
		double Maxvalue = MaxValue(Array);
		int []Location = Index(Array);
		System.out.println("The location of the largest element is " + Maxvalue + " at " + "(" + Location[0] + "," + Location[1] + ")");
	}
}






