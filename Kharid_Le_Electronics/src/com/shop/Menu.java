package com.shop;

import java.util.Scanner;

public class Menu {

	public void menu() 
	{
		System.out.println("WELCOME TO KHARID LE ELECTRONICS");
		System.out.println("ELECTRONIS ITEMS : ");
		System.out.println("1. TV "+"\n"+"2. Mobile Phones "+"\n"+ "3. Laptops "+"\n"+"4. Refrigerator"+"\n"+"5. Accessories");
		int ch2;
		Scanner s2= new Scanner(System.in);
		System.out.println("Which Product you want to buy: ");
		ch2=s2.nextInt(); 
		switch(ch2)
		{
		case 1 : 
			
			TV t1=new TV();
			t1.Brands();
		
		}

	}

}
