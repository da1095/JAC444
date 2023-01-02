package ws4;
/**********************************************
Workshop #
Course:<JAC44> - Semester
Last Name:<Ahir Ahir>
First Name:<Devang Ramubhai>
ID:<153484209>
Section:<NCC>
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:<submission date>
**********************************************/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Task2 {
	public void count(String string,char c){
	     char search = c;             // Character to search is 'a'.
	  
	  int count=0;
	  for(int i=0; i<string.length(); i++)
	  {
	      if(string.charAt(i) == search)
	      count++;
	  }
	  System.out.println("Number of "+c +" is "+count);
	    }
	      public String readFileToString(String filename) throws IOException {
	        StringBuilder bd = new StringBuilder();
	        File f = new File(filename);
	        //f.createNewFile();
	        Scanner s = new Scanner(f);
	        while (s.hasNextLine()) {
	            bd.append(s.nextLine());
	        }
	        return bd.toString();
	    }
	    
	    
	      public static void main(String[] args) throws IOException{
	     
	    char[] chars={'A','a','B','b','C','c','D','d','E','e','F','f','G','g','H','h','I','i','J','j','k','K','L','l','M','m','n','N','P','p','Q','q','R','r','S','s','T','t','U','u','V','v','W','w','X','x','Y','y','Z','Z'};
	    System.out.println("Enter filename:");
	    Task2 t=new Task2();
	    Scanner s = new Scanner(System.in);
	    String filename=s.next();
	    String st=t.readFileToString(filename);
	    for(int i=0;i<chars.length;i++){
	    char c=chars[i];
	    t.count(st, c);
	    }
	   
	 
	    }
}
