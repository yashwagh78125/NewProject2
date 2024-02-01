package com.program;

public class Array_element_frequency {

	public static void main(String[] args)
	{
	  int count=0;
      int arr[]= {1,5,3,6,7,4,4,78,5,43,1,474,3};
      for(int i=0;i<arr.length;i++)
      {
    	  count=0;
    	  for(int j=i+1;j<arr.length;j++)
    	  {
    		 if(arr[i]==arr[j])
    		 {
    			 count++;
    			 System.out.println("Number of count of "+arr[i]+" is ="+count);
    			
    		 }
    		 
    	  }
      }
	}

}
