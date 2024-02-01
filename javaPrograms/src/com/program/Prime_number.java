package com.program;
public class Prime_number {
	public static void main(String arg[])
	{
	 boolean flag =false;
	 int n=29;
	 for(int i=2;i<n/2;i++)
	 {
		 if(n%i==0)
		 {
			 flag=true;
			 break;
		 }
	 }
	 
		 if(!flag)
		 {
			 System.out.println("Number is prime number "+n);
		 }
		 else
		 {
			 System.out.println("Number is not prime number "+n);
		 }
		 
	 }

	}

