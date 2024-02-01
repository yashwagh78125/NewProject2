package com.program;
import java.util.Scanner;
public class punctuation_string {

	public static void main(String[] args)
	{
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='!')
			{
				count++;
			};
		}
		System.out.println("Numebr of puctuation in string is="+count);

	}

}
