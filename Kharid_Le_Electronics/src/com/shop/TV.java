package com.shop;

import java.util.Scanner;


public  class TV extends Menu

{
	

	public void Brands() 
	{
		int ch;
		Scanner s1= new Scanner(System.in);
		System.out.println("1. MI "+"\n"+"2. Sony "+"\n"+"3. LG "+"\n"+"4. Panasonic "+"\n"+"5. Samsung ");
		System.out.println("Choose your Brand : ");
		ch=s1.nextInt();
	
		switch(ch)
		{
		case 1 : 
			System.out.println("Choose your Model : ");
			System.out.println("Features");
			
		}
		
	}
}
	

