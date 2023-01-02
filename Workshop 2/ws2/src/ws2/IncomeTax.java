/**********************************************
Workshop #2
Course:<subject type> - JAC444
Last Name:<Ahir Ahir>
First Name:<Devang>
ID:<153484209>
Section:<NCC>
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:<submission date>
**********************************************/


package ws2;

import java.util.*;

class IncomeTax
{
	public static void main(String args[])
		{
			Scanner scanner = new Scanner (System.in);
			System.out.println("0 - Compute personal Income Tax");
			System.out.println("1 - Print the tax tables for taxable incomes (with range)");
			System.out.println("2 - Exit");
			int opt = scanner.nextInt();
			if (opt == 0)
				option1();
			else if (opt == 1)
				option2();
		}

	public static void option1()
	{
		Scanner scanner = new Scanner (System.in);
		double Tax=0;
		System.out.println("0 - single filer");
		System.out.println("1 - married jointly or qualifying widow(er)");
		System.out.println("2 - married seperately");
		System.out.println("3 - head of household");
		System.out.print("Enter the filing status: ");
		int Filing_Status = scanner.nextInt();
		System.out.print("Enter the Taxable Income: $");
		double Taxable_Income = scanner.nextDouble();

		if (Filing_Status == 0)
			Tax = SINGLE_FILER(Taxable_Income);

		if (Filing_Status == 1)
			Tax = MARRIED_JOINTLY_QUALIFIED_WIDOWER(Taxable_Income);
		
		if (Filing_Status == 2)
			Tax = MARRIED_SEPERATELY(Taxable_Income);
		
		if (Filing_Status == 3)
			Tax= HEAD_OF_HOUSEHOLD(Taxable_Income);
		
		System.out.println("Tax is: $"+Tax);

	}

	//single filer
	public static double SINGLE_FILER(double Taxable_Income)
	{
		double Tax=0;
		if (Taxable_Income <= 27050)
			Tax = 0.15*Taxable_Income;
		else if (Taxable_Income > 27050 && Taxable_Income <= 65550)
			Tax = (0.15*27050)+(0.275*(Taxable_Income-27050));
		else if (Taxable_Income > 65550 && Taxable_Income <= 136750)
			Tax = (0.15*27050)+(0.275*(65550-27050))+(0.305*(Taxable_Income-65550));
		else if (Taxable_Income > 136750 && Taxable_Income <= 297350)
			Tax = (0.15*27050)+(0.275*(65550-27050))+(0.305*(136750-65550)) + (0.355*(Taxable_Income - 136750));
		else if (Taxable_Income>297350)
			Tax = (0.15*27050)+(0.275*(65550-27050))+(0.305*(136750-65550)) + (0.355*(297351 - 136750)) + (0.391*(Taxable_Income-297351));
		
		return Tax;
	}
	 
	//married and jointly qualified widower
	public static double MARRIED_JOINTLY_QUALIFIED_WIDOWER(double Taxable_Income)
	{
		double Tax=0;
		if (Taxable_Income <= 45200)
			Tax = 0.15*Taxable_Income;
		else if (Taxable_Income > 45200 && Taxable_Income <= 109250)
			Tax = (0.15*45200)+(0.275*(Taxable_Income-45200));
		else if (Taxable_Income > 109250 && Taxable_Income <= 166500)
			Tax = (0.15*45200)+(0.275*(109250-45200))+(0.305*(Taxable_Income-109250));
		else if (Taxable_Income > 166500 && Taxable_Income <= 297350)
			Tax = (0.15*45200)+(0.275*(109250-45200))+(0.305*(166500-109250)) + (0.355*(Taxable_Income - 136750));
		else if (Taxable_Income>297350)
			Tax = (0.15*45200)+(0.275*(109250-45200))+(0.305*(166500-109250)) + (0.355*(297351 - 166500)) + (0.391*(Taxable_Income-297351));
		
		return Tax;
	}
	
	 
	//Married but filing seperately
	public static double MARRIED_SEPERATELY(double Taxable_Income)
	{
		double tax=0;
		if (Taxable_Income <= 22600)
		tax = 0.15*Taxable_Income;
		else if (Taxable_Income > 22600 && Taxable_Income <= 54625)
		tax = (0.15*22600)+(0.275*(Taxable_Income-22600));
		else if (Taxable_Income > 54625 && Taxable_Income <= 83250)
		tax = (0.15*22600)+(0.275*(54625-22600))+(0.305*(Taxable_Income-54625));
		else if (Taxable_Income > 83250 && Taxable_Income <= 148675)
		tax = (0.15*22600)+(0.275*(54625-22600))+(0.305*(83250-54625)) + (0.355*(Taxable_Income - 136750));
		else if (Taxable_Income>148675)
		tax = (0.15*22600)+(0.275*(54625-22600))+(0.305*(83250-54625)) + (0.355*(148675 - 83250)) + (0.391*(Taxable_Income-148675));
		
		return tax;
	}

	
	//Main head of the family 
	public static double HEAD_OF_HOUSEHOLD(double Taxable_Income)
	{
		double Tax=0;
		if (Taxable_Income <= 36250)
			Tax = 0.15*Taxable_Income;
		else if (Taxable_Income > 36250 && Taxable_Income <= 93650)
			Tax = (0.15*36250)+(0.275*(Taxable_Income-36250));
		else if (Taxable_Income > 93650 && Taxable_Income <= 151650)
			Tax = (0.15*36250)+(0.275*(93650-36250))+(0.305*(Taxable_Income-93650));
		else if (Taxable_Income > 151650 && Taxable_Income <= 297350)
			Tax = (0.15*36250)+(0.275*(93650-36250))+(0.305*(151650-93650)) + (0.355*(Taxable_Income - 136750));
		else if (Taxable_Income>297350)
			Tax = (0.15*36250)+(0.275*(93650-36250))+(0.305*(151650-93650)) + (0.355*(297350 - 151650)) + (0.391*(Taxable_Income-297350));
		
		return Tax;
	}

	
	
	public static void option2()
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the amount From: $");
		double Lower_Limit = scanner.nextDouble();
		System.out.print("Enter the amount To: $");
		double Upper_limit = scanner.nextDouble();
		System.out.println("2001 tax tables for taxable incomes from $"+Lower_Limit+" to $"+Upper_limit);
		System.out.println("***********************");
		System.out.println("Taxable Income \t Single \t Married Joint or Qualifying widow(er) \t Married Seperately \t Head of House");
		System.out.println("***********************");
		double i;
		for (i=Lower_Limit; i<=Upper_limit; i+=1000.0)
		{
			double s = SINGLE_FILER(i);
			double mj = MARRIED_JOINTLY_QUALIFIED_WIDOWER(i);
			double ms = MARRIED_SEPERATELY(i);
			double h = HEAD_OF_HOUSEHOLD(i);
			System.out.println(i+"\t"+s+"\t"+mj+"\t"+ms+"\t"+h);
		}
		System.out.println();
		
		System.out.println("2009 tax tables for taxable incomes from $"+Lower_Limit+" to $"+Upper_limit);
		for (i=Lower_Limit; i<=Upper_limit; i+=1000.0)
		{
			double s = SINGLE_FILER(i);
			double mj = MARRIED_JOINTLY_QUALIFIED_WIDOWER(i);
			double ms = MARRIED_SEPERATELY(i);
			double h = HEAD_OF_HOUSEHOLD(i);
			System.out.println(i+"\t"+s+"\t"+mj+"\t"+ms+"\t"+h);
		}
	}
}
