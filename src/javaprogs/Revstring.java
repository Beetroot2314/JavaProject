package javaprogs;
import java.io.*;


public class Revstring {

	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a string to be reversed");
		String str=br.readLine();
		
		String rev="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			rev=ch+rev;
		}
		
		System.out.println("Reverse of the string "+str+" is "+rev);
		
		
		
	}
	
}
