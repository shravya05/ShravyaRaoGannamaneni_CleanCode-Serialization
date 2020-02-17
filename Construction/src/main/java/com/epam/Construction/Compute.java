package com.epam.Construction;

import java.util.*;
public class Compute {
	public static void main(String args[])
	{
		String st=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total area of the house");
		int total_area=s.nextInt();
		Construction c=new Construction();
		String str=null;
		do
		{
			System.out.println("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High standard Material and Fully automatic home");
			int ch=s.nextInt();
			if(ch!=4){
				System.out.println("Do you want a fully automated house(y/n)");
				st=s.next();
				}
			switch(ch)
			{
			case 1:
				if(st.equalsIgnoreCase("y"))
					System.out.println(c.construct(total_area,1900));
				else
					System.out.println(c.construct(total_area,1200));
				break;
			case 2:
				if(st.equalsIgnoreCase("y"))
					System.out.println(c.construct(total_area,2200));
				else
					System.out.println(c.construct(total_area,1500));
				break;
			case 3:
				if(st.equalsIgnoreCase("y"))
					System.out.println(c.construct(total_area,2500));
				else
					System.out.println(c.construct(total_area,1800));
				break;
			case 4:
				System.out.println(c.construct(total_area,2500));
				break;	
			}
			System.out.println("Do you want to continue y/n?");
			str=s.next();
		}while(str.equalsIgnoreCase("Y"));
	}
}
