/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter character");
char c=sc.next().charAt(0);
if((c>='a' && c<='z') || (c>='A' && c<='Z'))
System.out.println(c +"is an alphabet.");
else
System.out.println(c +"is not an alphabet.");
	}
}
