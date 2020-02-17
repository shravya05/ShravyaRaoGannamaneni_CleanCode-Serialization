package com.epam.SiCi;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 String str=null;
		 Methods m=new Methods();
		System.out.println("Enter the principle amount");
         double p=s.nextDouble();
         System.out.println("Enter the time period");
         double t=s.nextDouble();
         System.out.println("Enter the rate of interest");
         double r=s.nextDouble();
         do {
         System.out.println("\n1.Simple Interest\n2.Compound Interest");
         System.out.println("Enter the choice");
         int n=s.nextInt();
         switch(n)
         {
         case 1:
        	  System.out.println(m.getSimpleInterest(p,t,r));
        	  break;
         case 2:
        	 System.out.println(m.getCompoundInterest(p,t,r));
        	  break;
         }
         System.out.println("Do you want to continue Y/N?");
         str=s.next();
	}while(str.equalsIgnoreCase("Y"));
	}

}
