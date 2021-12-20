package javaprogs;
import java.io.*;


public class Palindrome {
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number to be checked");
		int a=Integer.parseInt(br.readLine());
		int temp=a;
		int rem;
		int rev=0;
		
		while(temp>0)
		{
		rem=temp%10;
		rev=(rev*10)+rem;
		temp=temp/10;
		}
		
		
		if(a==rev)
			System.out.println(a+" is Palindrome");
		else
			System.out.println(a+" is not Palindrome");
		
		
		
	}

}
