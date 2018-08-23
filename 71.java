import java.util.*;
import java.lang.*;
import java.io.*;
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		if(str.equals(rev))
		System.out.println("yes");
		else
		System.out.println("no");
 
	}
}
