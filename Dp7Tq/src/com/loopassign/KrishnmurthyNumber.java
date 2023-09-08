package com.loopassign;

 
public class KrishnmurthyNumber {

	static void checkKrishna(int num)
	{
		int original= num;
		int sum=0;
		do
		{
			int r= num%10;
 			long fact=1;
			for(int i=1;i<=r;i++)
			{
				fact*=i;
			}
			
			sum+=fact;
			num/=10;
			
 			
			
		}while(num!=0);
		
		if(sum==original)
		{
			System.out.println(original+" is a Krishnamurthy number");
		}
		else
		{
			System.out.println(original+" is not a Krishnamurthy number");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int num=143;
		checkKrishna(num);
		
	}
	

}
