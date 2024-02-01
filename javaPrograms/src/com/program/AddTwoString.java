package com.program;

public class AddTwoString {

	public static void main(String[] args) 
	{
		 int rem=0,count=0;
		 int n=32167;
		 while(n>0)
		 {	    
			rem=n%10;
			n=n/10;
			count++;
		 }
		 System.out.println(count);
	}

}
