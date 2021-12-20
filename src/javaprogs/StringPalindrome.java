package javaprogs;
import java.io.*;

public class StringPalindrome {
	
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string to be checked for Palindrome");
		String str=br.readLine();
		String rev="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			rev=ch1+rev;
			
				
		}
		
		if(str.equals(rev))
			System.out.println("Palindromic String");
		else
			System.out.println("Non Palindromic String");
		
	}

}
