//print  in reverse
import java.util.*;
class Q3ReverseIndia
{
   public static void main(String[] args)   
{  
   String str="I Love India";
	System.out.println(reversW(str));
   
}

public static String reversW(String s)
{
	String words[]=s.split("\\s");
	String reversewor="";
	
	for(String s1 : words)
	{
		StringBuilder s2=new StringBuilder(s1);
		s2.reverse();
		reversewor+=s2.toString()+" ";
    }
	return reversewor.trim();

}	  
 
 
}  
