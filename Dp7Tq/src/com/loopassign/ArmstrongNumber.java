package com.loopassign;

public class ArmstrongNumber {

	static int countdigits(int num)
	{
		int count=0;
		do
		{
			count++;
			num/=10;
			
		}while(num!=0);
		
		return count;
	}
	
	static void checkArmstrong(int num, int count)
	{
	    int original=num;
	    double sum=0;
	    do
	    {
	    	int r=num%10;
	    	sum= sum+ Math.pow(r, count);
	    	num/=10;
	    	
	    }while(num!=0);
	    
	    System.out.println("Sum using logic:"+sum);
	    
	    if(sum==original)
	    {
	    	System.out.println("Armstrong number");
	    }
	    else
	    {
	    	System.out.println("Not an armstrong number");
	    }
		
	}
	
	static void checkArmstrong1(int num, int count)
	{
	    int original=num;
	    double sum=0;
	    do
	    {
	    	int r=num%10;
	         
	    	int pro=1;
	    	for(int i=1;i<=count;i++)
	    	{
	    		pro= pro*r;
	    	}
 	    	sum+=pro;
 	    	
		    num/=10;
	    	
	    }while(num!=0);
	    
	    System.out.println("Sum using logic:"+sum);
	    
	    if(sum==original)
	    {
	    	System.out.println("Armstrong number");
	    }
	    else
	    {
	    	System.out.println("Not an armstrong number");
	    }
		
	}
	
	
	public static void main(String[] args) {
		
		int num= 153; 
		
		int n= countdigits(num);
		
		checkArmstrong1(num, n);
		
	}
}
